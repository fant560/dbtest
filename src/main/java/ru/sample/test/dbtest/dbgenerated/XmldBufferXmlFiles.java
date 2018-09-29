package ru.sample.test.dbtest.dbgenerated;

import javax.persistence.Entity;

@Entity
public class XmldBufferXmlFiles {

  private long xmlId;
  private String xmlContent;
  private String xmlSource;
  private java.sql.Date recordDate;


  public long getXmlId() {
    return xmlId;
  }

  public void setXmlId(long xmlId) {
    this.xmlId = xmlId;
  }


  public String getXmlContent() {
    return xmlContent;
  }

  public void setXmlContent(String xmlContent) {
    this.xmlContent = xmlContent;
  }


  public String getXmlSource() {
    return xmlSource;
  }

  public void setXmlSource(String xmlSource) {
    this.xmlSource = xmlSource;
  }


  public java.sql.Date getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(java.sql.Date recordDate) {
    this.recordDate = recordDate;
  }

}
