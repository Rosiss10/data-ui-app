package com.cipher.datauiapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Nationality {

    @Id
    private Integer Id;
    private String name;
    private String capital;
    private String updateBy;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateOn;

    public Nationality()
    {

    }


    public Nationality(Integer id, String name, String capital, String updateBy, Date updateOn) {
        Id = id;
        this.name = name;
        this.capital = capital;
        this.updateBy = updateBy;
        this.updateOn = updateOn;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }
}
