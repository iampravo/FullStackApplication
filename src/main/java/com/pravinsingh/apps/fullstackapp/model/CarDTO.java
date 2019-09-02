package com.pravinsingh.apps.fullstackapp.model;

public class CarDTO {
    private int serialId;
    private String brandName;
    private String modelName;
    private int lifeTime;


    public CarDTO() {
    }

    public CarDTO(int serialId, String brandName, String modelName, int lifeTime) {
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
