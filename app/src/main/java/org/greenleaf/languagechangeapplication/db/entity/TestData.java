package org.greenleaf.languagechangeapplication.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/8/1
 * time: 10:00
 */
@Entity
public class TestData {
    @Id(autoincrement = true)
    private Long id;
    private String testString;
    private Long testLong;
    private java.util.Date testDate;
    private Integer testInt;
    private Boolean testBoolean;
    @Generated(hash = 1077927250)
    public TestData(Long id, String testString, Long testLong,
            java.util.Date testDate, Integer testInt, Boolean testBoolean) {
        this.id = id;
        this.testString = testString;
        this.testLong = testLong;
        this.testDate = testDate;
        this.testInt = testInt;
        this.testBoolean = testBoolean;
    }
    @Generated(hash = 1580692206)
    public TestData() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTestString() {
        return this.testString;
    }
    public void setTestString(String testString) {
        this.testString = testString;
    }
    public Long getTestLong() {
        return this.testLong;
    }
    public void setTestLong(Long testLong) {
        this.testLong = testLong;
    }
    public java.util.Date getTestDate() {
        return this.testDate;
    }
    public void setTestDate(java.util.Date testDate) {
        this.testDate = testDate;
    }
    public Integer getTestInt() {
        return this.testInt;
    }
    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }
    public Boolean getTestBoolean() {
        return this.testBoolean;
    }
    public void setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
    }
}
