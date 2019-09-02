package com.pravinsingh.apps.fullstackapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heatmap")
public class HeatMap {
    @Id
    @GeneratedValue
    private int id;
    private String groupId;
    private String variable;
    private int value;

    public HeatMap() {
    }

    public HeatMap(String groupId, String variable, int value) {
        this.groupId = groupId;
        this.variable = variable;
        this.value = value;
    }

    public HeatMap(int id, String groupId, String variable, int value) {
        this.id = id;
        this.groupId = groupId;
        this.variable = variable;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
