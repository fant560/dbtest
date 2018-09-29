-- скрипт создания БД с нуля
-- !!! ВНИМАНИЕ !!!
-- !!! Если запустить на БД с данными все нахрен удалит, не делайте этого !!!

-- порядок выполения команд важен !!
-- первичный ключ таблицы
create sequence IF NOT EXISTS xmld_signers_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- первичный ключ таблицы
create sequence if not exists xmld_participants_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- первичный ключ таблицы
create sequence if not exists xmld_utd_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- первичный ключ таблицы
create sequence if not exists xmld_utd_lines_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- первичный ключ таблицы
create sequence if not exists xmld_utd_payment_doc_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- уникальный номер на группу платежно-расчетных элементов из одного xml-документа
create sequence if not exists xmld_utd_payment_doc_holder_s increment by 1 start 1 cache 50 no maxvalue;
-- первичный ключ таблицы
create sequence if not exists xmld_buffer_xml_files_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- уникальный номер на группу подписантов из одного xml-документа
create sequence if not exists xmld_signers_holder_id_seq increment by 1 start 1 cache 50 no maxvalue;
-- для удобства
create sequence if not exists full_name_table_id_seq increment by 1 start 1 cache 50 no maxvalue;

-- всякие перечисления
drop type if exists signer_type cascade;
create type signer_type as enum('ФЛ', 'ЮЛ', 'ИП');

drop type if exists authority_type cascade;
create type authority_type as enum('1','2','3','4','5','6');

drop type if exists signer_status_type cascade;
create type signer_status_type as enum('1','2','3','4');

drop type if exists knd_type cascade;
create type knd_type as enum('1115125');

drop type if exists document_type cascade;
create type document_type as enum('СЧФ', 'СЧФДОП', 'ДОП');

drop type if exists attribute_type cascade;
create type attribute_type as enum('1', '2', '3', '4', '5');

drop type if exists tax_rate_type cascade;
create type tax_rate_type as enum('0%', '10%', '18%', '10/110', '18/118', 'без НДС');

drop type if exists xml_source_type cascade;
create type xml_source_type as enum('WEB-SERVICE', 'MANUAL', 'FILESYSTEM');

-- ограничение на длину строкового поля, включая границы
create or replace function length_constraint(some_string text, min int, max int) returns boolean as
$$
  begin
    return length(some_string) >= min  and length(some_string) <= max;
  end;
$$ language 'plpgsql';

-- триггер на автовставку даты добавления
create or replace function insert_creation_time() returns  trigger as
$$
  begin
    insert into xmld_signers(row_creation_time) values (now());
    return new;
  end;
$$ language 'plpgsql';

-- триггер на автовставку даты обновления
create or replace function insert_updating_time() returns trigger as
$$
  begin
    insert into xmld_signers(row_update_time) values (now());
    return new;
  end;
$$ language 'plpgsql';

drop table if exists full_name_table cascade;
create table full_name_table (
  id integer primary key default nextval('full_name_table_id_seq'),
  last_name varchar(60) check(length(last_name) > 0),
  first_name varchar(60) check(length(first_name) > 0),
  patronymic varchar(60) check(length(patronymic) > 0)
);

drop table if exists xmld_participants cascade;
create table if not exists xmld_participants(
  participant_id integer primary key default nextval('xmld_participants_id_seq'),
  participant_type text,
  inn_ip varchar(12) unique check (inn_ip ~ '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{10}'),
  requisites text check(length_constraint(requisites, 1, 100)),
  additional_info text check(length_constraint(additional_info, 1, 255)),
  organization_name text check(length_constraint(organization_name, 1, 1000)),
  inn_le varchar(10) unique check (inn_le ~ '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}'),
  kpp varchar(9) check (kpp ~ '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})([0-9]{2})([0-9A-Z]{2})([0-9]{3})'),
  index varchar(6) check(index ~ '[0-9]{6}'),
  -- нужна отдельная таблица
  region varchar(2) check(region ~ '[0-9]{2}'),
  district text check(length_constraint(district, 1, 50)),
  city text check(length_constraint(city, 1, 50)),
  locality text check(length_constraint(locality, 1, 50)),
  street text check(length_constraint(street, 1, 50)),
  home text check(length_constraint(home, 1, 20)),
  housing text check(length_constraint(housing, 1, 20)),
  flat text check(length_constraint(flat, 1, 20)),
  country_code varchar(3) check(country_code ~ '[0-9]{3}'),
  address text check(length_constraint(address, 1, 255)),
  phone text check(length_constraint(phone, 1, 255)),
  email text check(length_constraint(email, 1, 255)),
  -- под банк надо тоже отдельную таблицу
  bank_name text check(length(bank_name) < 1001 and length(bank_name) > 1),
  bik varchar(9) check(bik ~ '[0-9]{9}'),
  corresponding_account text check(length_constraint(corresponding_account, 1, 20)),
  account_number text check(length_constraint(account_number, 1, 20)),
  okpo text check(length_constraint(okpo, 1, 10)),
  structured_department text check(length_constraint(structured_department, 1, 1000)),
  participant_info text check(length_constraint(participant_info, 1, 255)),
  code_gar text check(length_constraint(code_gar, 1, 36)),
  full_name integer references full_name_table(id)
);



drop table if exists xmld_utd_headers cascade ;
create table xmld_utd_headers(
  utd_id integer primary key default nextval('xmld_utd_id_seq'),
  account_positional  text check(length_constraint(account_positional, 1, 1000)),
  creation_date date check(creation_date <= '31.12.2099' and creation_date >= '01.01.1900'),
  knd knd_type,
  -- TODO назовите меня правильно
  formation_date date,
  file_creation_date varchar(8) check(file_creation_date ~ '[0-9]{2}.[0-9]{2}.[0-9]{2}'),
  code_okv varchar(3) check(code_okv ~ '[0-9]{3}'),
  correction_number integer check(correction_number > -100 and correction_number < 999),
  correction_date date,
  total_to_pay numeric(19, 2),
  another_total_to_pay numeric(19, 2),
  taxes_amount numeric(19, 2),
  record_creation_date date,
  file_identifier text check(length_constraint(file_identifier, 1, 200)),
  participant_id text check(length_constraint(participant_id, 3, 46)),
  updating_date date,
  doctype document_type,
  first_document_name text check(length_constraint(first_document_name, 1, 255)),
  additional_document_name text check(length_constraint(additional_document_name, 1, 255)),
  subject_name text check(length_constraint(subject_name, 1, 1000)),
  reason text check(length_constraint(reason, 1, 120)),
  vendor_participant_id integer,
  ship_participant_id integer,
  cons_participant_id integer,
  buyer_particpant_id integer,
  contract_identifier text check(length_constraint(contract_identifier, 1, 255)),
  okv_name text check(length_constraint(okv_name, 1, 100)),
  exchange_rate numeric(10, 4),
  -- многие ко многим в виде отельной таблицы связей
  -- TODO подумать над этим
  -- или нет, что толку айдишники вытаскивать
  netto numeric(26, 11),
  seller_id_reference integer unique,
  payment_id_reference integer unique,
  buyer_id_refernce integer unique
);

drop table if exists xmld_signers cascade;
create table if not exists xmld_signers(
  signer_id integer primary key default nextval('xmld_signers_id_seq'),
  holder_id integer references xmld_utd_headers(utd_id) default nextval('xmld_signers_holder_id_seq'),
  signer signer_type,
  authority_area authority_type,
  signer_status signer_status_type,
  authority_description text check(length_constraint(authority_description, 1, 255)),
  inn_ip varchar(12) unique check (inn_ip ~ '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{10}'),
  authority_description_organization text check(length_constraint(authority_description_organization, 1, 255)),
  additional_info text check(length_constraint(additional_info, 1, 255)),
  inn_le varchar(10) unique check (inn_le ~ '([0-9]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{8}'),
  organization text check(length_constraint(organization, 1, 255)),
  position varchar(128),
  requisites_government_registration text check(length_constraint(requisites_government_registration, 1, 100)),
  full_name integer references full_name_table(id),
  --row_creation_time timestamp with time zone default now(),
  row_creation_time timestamp with time zone,
  --row_update_time timestamp with time zone not null default now(),
  row_update_time timestamp with time zone
);

drop trigger if exists add_insertion_time on xmld_signers;
create trigger add_insertion_time
  after insert on xmld_signers
    for each row execute procedure insert_creation_time();

drop trigger if exists add_updating_time on xmld_signers;
create trigger add_updating_time
  after update on xmld_signers
    for each row execute procedure insert_updating_time();

drop table if exists header_payment;
create table header_payment(
  header_id integer,
  payment_id integer
);



drop table if exists signer_seller;
-- корявенькая реализация связи многие ко многим, через отдельную таблицу связей по первичному ключу
create table signer_seller (
  signer_id integer,
  seller_id integer
);

drop table if exists xmld_utd_lines;
create table xmld_utd_lines(
  utd_line_id integer primary key default nextval('xmld_utd_lines_id_seq'),
  utd_id integer,
  row_number numeric(6),
  product_info text check(length_constraint(product_info, 1, 1000)),
  amount numeric(26, 11),
  code varchar(4) check (code ~ '[0-9]{3}' or code = '0000'),
  price numeric(26,11),
  total_price_taxesless numeric(19, 2),
  total_price numeric(19, 2),
  taxes numeric(19, 2),
  excise_duty numeric(19, 2),
  record_date date,
  product_origin_code varchar check(product_origin_code ~ '[0-9]{3}'),
  attribute attribute_type,
  attribute_additional_info text check(length_constraint(attribute_additional_info, 1, 4)),
  characteristic text check(length_constraint(characteristic, 1, 255)),
  measurment_unit text check(length_constraint(measurment_unit, 1, 255)),
  country_origin text check(length_constraint(country_origin, 1, 255)),
  -- TODO переназовите меня
  amount_to_free numeric(26, 11),
  debet varchar(9) check(debet ~ '[0-9]{9}'),
  credit varchar(9) check(credit ~ '[0-9]{9}'),
  tax_rate tax_rate_type
);


drop table if exists xmld_utd_payment_documents;
create table xmld_utd_payment_documents(
  payment_document_id integer primary key default nextval('xmld_utd_payment_doc_id_seq'),
  holder_id integer default nextval('xmld_utd_payment_doc_holder_s'),
  number_text text check(length_constraint(number_text, 1, 30)),
  creation_date date
);


drop table if exists xmld_buffer_xml_files;
create table xmld_buffer_xml_files(
  xml_id integer primary key default nextval('xmld_buffer_xml_files_id_seq'),
  xml_content bytea not null,
  xml_source xml_source_type,
  record_date date
);

-- циклические зависимости по полям, поэтому нет ограничений при создании таблиц
alter table xmld_utd_headers add constraint seller_id_fk foreign key (seller_id_reference) references xmld_signers(signer_id);
alter table xmld_utd_headers add constraint payment_id_fk foreign key (payment_id_reference) references xmld_utd_payment_documents(payment_document_id);
alter table xmld_utd_headers add constraint buyer_id_reference foreign key (buyer_id_refernce) references xmld_signers(signer_id);
alter table header_payment add constraint header_fk foreign key (header_id) references xmld_utd_headers(utd_id);
alter table header_payment add constraint payment_fk foreign key (payment_id) references xmld_utd_payment_documents(payment_document_id);
alter table header_payment add constraint header_payment_pk primary key(header_id, payment_id);
alter table signer_seller add constraint signer_fk foreign key(signer_id) references xmld_signers(signer_id);
alter table signer_seller add constraint seller_fk foreign key(seller_id) references xmld_utd_headers(seller_id_reference);
alter table signer_seller add constraint signer_seller_pk primary key(signer_id, seller_id);
alter table xmld_utd_payment_documents add constraint holder_fk foreign key(holder_id) references xmld_utd_headers(payment_id_reference);
alter table xmld_utd_lines add constraint utd_fk foreign key(utd_id) references xmld_utd_headers(utd_id);
alter table xmld_utd_headers add constraint vendor_participant_fk foreign key(vendor_participant_id) references xmld_participants(participant_id);
alter table xmld_utd_headers add constraint ship_participant_fk foreign key(ship_participant_id) references xmld_participants(participant_id);
alter table xmld_utd_headers add constraint cons_participant_fk foreign key(cons_participant_id) references xmld_participants(participant_id);
alter table xmld_utd_headers add constraint buyer_participant_fk foreign key(buyer_particpant_id) references xmld_participants(participant_id);

