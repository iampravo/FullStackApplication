package com.pravinsingh.apps.fullstackapp.model;

public class HeatMapDTO {
    private String group;
    private String variable;
    private int value;

    public HeatMapDTO() {
    }

    public HeatMapDTO(String group, String variable, int value) {
        this.group = group;
        this.variable = variable;
        this.value = value;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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
