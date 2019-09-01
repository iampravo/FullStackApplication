package com.pravinsingh.apps.fullstackapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "serialId")
    private int serialId;
    @Column(name = "brandName")
    private String brandName;
    @Column(name = "modelName")
    private String modelName;
    @Column(name = "lifeTime")
    private int lifeTime;
    //private String cityOfRegistration;
   // private String ownerName;



    public Car() {
    }

    public Car(int serialId, String brandName, String modelName, int lifeTime) {
        this.serialId = serialId;
        this.brandName = brandName;
        this.modelName = modelName;
        this.lifeTime = lifeTime;
    }

    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
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
