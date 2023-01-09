package com.example.dedicasion33;

public class Country {
    String name;
    String existence;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExistence() {
        return existence;
    }

    public void setExistence(String existence) {
        this.existence = existence;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    String territory;


    public Country(String name, String existence, String territory, Integer image) {
        this.name = name;
        this.existence = existence;
        this.territory = territory;
        this.image = image;
    }

    Integer image;


}
