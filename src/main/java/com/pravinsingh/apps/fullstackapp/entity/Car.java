package com.pravinsingh.apps.fullstackapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Car {
    @Id
    private long serialId;
    private String brandName;
    private String modelName;
    private int lifeTime;
    //private String cityOfRegistration;
   // private String ownerName;



    public Car() {
    }

    public Car(long serialId, String brandName, String modelName, int lifeTime) {
        this.serialId = serialId;
        this.brandName = brandName;
        this.modelName = modelName;
        this.lifeTime = lifeTime;
    }

    public long getSerialId() {
        return serialId;
    }

    public void setSerialId(long serialId) {
        this.serialId = serialId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
