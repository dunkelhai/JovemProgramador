package model.entities;

public class Car {
    Integer id;
    String color;
    String model;
    Double maxSpeed;
    Boolean sunRoof;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boolean getSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(Boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}
