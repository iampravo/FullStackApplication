package com.pravinsingh.apps.fullstackapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "histogram")
public class Histogram {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int value;

    public Histogram() {
    }

    public Histogram(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Histogram(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
