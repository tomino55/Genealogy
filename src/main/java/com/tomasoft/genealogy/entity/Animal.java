package com.tomasoft.genealogy.entity;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_father")
    private Animal father;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mother")
    private Animal mother;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_gender")
    private Gender gender;

    @Column(name = "name")
    private String name;

    public Animal(int id, Animal father, Animal mother, Gender gender, String name) {
        super(id);
        this.setFather(father);
        this.setMother(mother);
        this.setGender(gender);
        this.setName(name);
    }

    public Animal(){
        super();
    }


    public Animal getFather() {
        return father;
    }

    public void setFather(Animal father) {
        this.father = father;
    }

    public Animal getMother() {
        return mother;
    }

    public void setMother(Animal mother) {
        this.mother = mother;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
