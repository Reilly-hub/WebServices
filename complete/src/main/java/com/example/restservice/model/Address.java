package com.example.restservice.model;

public class Address {
    private int buildingNum;
    private String streetName;
    private City city;

    public Address(int buildingNum, String streetName, City city) {
        this.buildingNum = buildingNum;
        this.streetName = streetName;
        this.city = city;
    }

    public Address() {
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}