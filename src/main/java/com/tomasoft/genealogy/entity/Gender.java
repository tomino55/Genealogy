package com.tomasoft.genealogy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "abbreviation")
    private String abbreviation;

    public Gender(){
        super();
    }

    public Gender(int id, String name, String abbreviation){
        super(id);
        this.setName(name);
        this.setAbbreviation(abbreviation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
