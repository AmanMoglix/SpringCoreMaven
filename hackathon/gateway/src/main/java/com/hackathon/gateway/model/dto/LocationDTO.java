package com.hackathon.gateway.model.dto;

import org.json.JSONObject;

public class LocationDTO {

    private String locationId;

    private String shortName;

    private String name;

    private String line1;

    private String line2;

    private String country;

    private String state;

    private String city;

    private String zipCode;

    public LocationDTO() {
    }

    public LocationDTO(JSONObject location) {
        this.locationId = location.getString("locationId");
        this.shortName = location.optString("shortName");
        this.name = location.getString("name");
        this.line1 = location.optString("line1");
        this.line2 = location.optString("line2");
        this.country = location.optString("country");
        this.state = location.optString("state");
        this.city = location.optString("city");
        this.zipCode = location.optString("zipCode");
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
}
