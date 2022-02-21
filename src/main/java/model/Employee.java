package model;

import java.util.Date;

public class Employee implements Person {

    private String name;
    private TopSkill topSkill;
    private Date dateOfEmployment;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, TopSkill topSkill, Date dateOfEmployment) {
        this.name = name;
        this.topSkill = topSkill;
        this.dateOfEmployment = dateOfEmployment;
    }


    //methods from Person interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopSkill getTopSkill() {
        return this.topSkill;
    }

    public void setTopSkill(TopSkill topSkill) {
        this.topSkill = topSkill;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}