-- участник любой - в лоб по xsd
create type ТекстИнфоТип as (
  идентификатор text,
  значение text
);
create type СумНДСТип as (
  сумНал decimal,
  безНДС text
);

create type СумАкцизТип as (
  сумАкциз decimal,
  безАкциз text
);

create type ФИОТип as (
  фамилия text,
  имя text,
  отчество text
);

create type КонтактТип as (
  тлф text,
  элПочта text
);
create type СвИПТип as (
  фио ФИОТип,
  иннфл text,
  свГосРегПр text,
  иныеСвед text
);

create table АдрИнф(
  id serial primary key,
  кодСтр text,
  адрТекст text
);

create table АдрРФ(
  id serial primary key,
  индекс text,
  кодРегион text,
  район text,
  город text,
  населПункт text,
  улица text,
  дом text,
  корпус text,
  кварт text
);

create table АдресТип (
  id serial primary key,
  кодГАР text,
  -- один к одному
  адрИнф bigint references АдрИнф(id),
  адрРФ bigint references АдрРФ(id)
);

create table СвЮЛУч(
  id serial primary key,
  наимОрг text,
  иннюл text,
  кпп text
);

create table СвИнНеУч(
  id serial primary key,
  наимОрг text,
  иныеСвед text
);


create table ИдСв(
  id serial primary key,
  свИП СвИПТип,
  -- один к одному
  свЮЛУч bigint references СвЮЛУч(id),
  свИнНеУч bigint references СвИнНеУч(id)
);

create table СвБанк(
  id serial primary key,
  наимБанк text,
  бик text,
  корСчет text
);

create table БанкРекв(
  id serial primary key,
  номерСчета text,
  -- один к одному
  свБанк bigint references СвБанк(id)
);

create table ФЛ(
  id serial primary key,
  фио ФИОТип,
  иннфл text,
  иныеСвед text,
  госРегИПВыдДов text
);

create table ЮЛ(
  id serial primary key,
  фио ФИОТип,
  госРегИПВыдДов text,
  иннюл text,
  наимОрг text,
  должн text,
  иныеСведtext text
);


create table Подписант(
  id serial primary key,
  облПолн text,
  статус text,
  оснПолн text,
  оснПолнОрг text,
  ип СвИПТип,
  -- один к одному
  фл bigint references ФЛ(id),
  юл bigint references ЮЛ(id)
);




create table УчастникТип(
  id serial primary key,
  инфДляУчаст text,
  структПодр text,
  окпо text,
  контакт КонтактТип,
  -- один к одному
  адрес bigint references АдресТип(id),
  идСв bigint references ИдСв(id),
  банкРекв bigint references БанкРекв(id)
);

create table СвОЭДОтпр(
  id serial primary key,
  наимОрг text,
  иннюл text,
  идЭДО text
);

create table СвУчДокОбор(
  id serial primary key,
  идОтпр text,
  идПол text,
  -- один к одному
  свОЭДОотпр bigint references СвОЭДОтпр(id)
);



create table ОснПер(
  id serial primary key,
  наимОсн text,
  номОсн text,
  датаОсн text,
  допСвОсн text
);

create table ТранНакл(
  id serial primary key,
  номТранНакл text,
  датаТранНакл text
);

create table ТранГруз(
  id serial primary key,
  свТранГруз text,
  -- один к одному
  перевозчик bigint references УчастникТип(id),
  -- один ко многим
  транНакл bigint references ТранНакл(id)
);

create table СвПерВещи(
  id serial primary key,
  датаПерВещи text,
  свПерВещи text
);

create table РабОргПрод(
  id serial primary key,
  фио ФИОТип,
  должность text,
  иныеСвед text,
  оснПолн text
);

create table ФЛПер(
  id serial primary key,
  фио ФИОТип,
  иныеСвед text,
  оснДоверФЛ text
);


create table ПредОргПер(
  id serial primary key,
  фио ФИОТип,
  должность text,
  иныеСвед text,
  наимОргПер text,
  оснДоверОргПер text,
  оснПолнПредПер text
);

create table ИнЛицо(
  id serial primary key,
  -- один к одному
  предОргПер bigint references ИнЛицо(id),
  флПер bigint references ФЛПер(id)
);

create table СвЛицПер(
  id serial primary key,
  -- один к одному
  рабОргПрод bigint references РабОргПрод(id),
  инЛицо bigint references ИнЛицо(id)
);

create table СвПер(
  id serial primary key,
  содОпер text,
  видОпер text,
  датаПер text,
  -- один к одному
  свЛицПер bigint references СвЛицПер(id),
  транГруз bigint references ТранГруз(id),
  свПерВещи bigint references СвПерВещи(id),
  -- один ко многим List<ОснПер>
  оснПер bigint references ОснПер(id)
);

create table СвПРД(
  id serial primary key,
  номерПРД text,
  датаПРД text
);

create table ИспрСчФ(
  id serial primary key,
  номИспрСчФ decimal,
  датаИспрСчФ text
);

create table ТекстИнфоТипХранилищеЗначений(
  id serial primary  key,
  значение ТекстИнфоТип
);

create table ИнфПолФХЖ(
  id serial primary key,
  идФайлИнфПол text,
  -- один ко многим List<ТекстИнфТип>
  текстИнф bigint references ТекстИнфоТипХранилищеЗначений(id)
);

create table ИнфПолФХЖ1(
  id serial primary key,
  идФайлИнфПол text,
  -- один ко многим List<ТекстИнфТип>
  текстИнф bigint references ТекстИнфоТипХранилищеЗначений(id)
);

create table ДопСвФХЖ1(
  id serial primary key,
  идГосКон text,
  наимОКВ text,
  курсВал decimal
);

create table ГрузОт(
  id serial primary key,
  онЖе text,
  грузОтпр bigint
);

create table СвСчФакт(
  id serial primary key,
  номерСчФ text,
  датаСчФ text,
  кодОКВ text,
  -- один к одному
  свПрод bigint references УчастникТип(id),
  грузПолуч bigint references УчастникТип(id),
  свПокуп bigint references УчастникТип(id),
  испрСчФ bigint references ИспрСчФ(id),
  грузОт bigint references ГрузОт(id),
  допСвФХЖ1 bigint references ДопСвФХЖ1(id),
  инфПолФХЖ1 bigint references ИнфПолФХЖ1(id),
  -- один ко многим
  свПРД bigint references СвПРД(id)
);

create table ДопСведТов(
  id serial primary key,
  прТовРаб text,
  допПризн text,
  кодТов text,
  наимЕдИзм text,
  крНаимСтрПр text,
  надлОпл decimal,
  корСчДебет text,
  корСчКредит text
);

create table СвТД(
  id serial primary key,
  кодПроисх text,
  номерТД text
);

create table СведТов(
  id serial primary key,
  стТовУчНал decimal,
  налСт text,
  стТовБезНДС decimal,
  ценаТов decimal,
  колТов decimal,
  океиТов text,
  наимТов text,
  номСтр decimal,
  акциз СумАкцизТип, --TODO
  сумНал СумНДСТип,
  -- один к одному
  допСведТов bigint references ДопСведТов(id),
  --List<СвТД>
  свТД bigint references СвТД(id),
  --List<ТекстИнфТип>
  инфПолФХЖ2 bigint references ТекстИнфоТипХранилищеЗначений(id)
);

create table ВсегоОпл(
  id serial primary key,
  неттоВс decimal,
  стТовБезНДСВсего decimal,
  стТовУчНалВсего decimal,
  -- кастомный тип TODO
  сумНалВсего СумНДСТип
);

create table ТаблСчФакт(
  id serial primary key,
  -- один к одному
  всегоОпл bigint references ВсегоОпл(id),
  -- один ко многим List<СведТов>
  сведТов bigint references СведТов(id)
);

create table СвПродПер(
  id serial primary key,
  -- один к одному
  свПер bigint references СвПер(id),
  инфПолФХЖЗ bigint references ИнфПолФХЖ(id)
);

create table Документ(
  id serial primary key,
  кнд text,
  функция text,
  поФактХЖ text,
  наимДокОтпр text,
  датаИнфПр text,
  времИнфПр text,
  наимЭконСубСост text,
  оснДоверОргСост text,
  -- ключи один к одному
  свСчФакт bigint references СвСчФакт(id),
  таблСчФакт bigint references ТаблСчФакт(id),
  свПродПер bigint references СвПродПер(id),
  -- один ко многим List<Подписант>
  подписант bigint references Подписант(id)
);

create table Файл(
  id serial primary key,
  версФорм text,
  идФайл text,
  версПрог text,
  -- один к одному
  документ bigint references Документ(id),
  свУчДокОбор bigint references СвУчДокОбор(id)
);