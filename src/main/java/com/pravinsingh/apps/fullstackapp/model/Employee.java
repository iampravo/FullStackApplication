package com.pravinsingh.apps.fullstackapp.model;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String lastname;
    private int age;
    private LocalDate dateOfBirth;


    public Employee(String name, String lastname, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
