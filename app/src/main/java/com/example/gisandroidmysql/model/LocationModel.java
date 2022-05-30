package com.example.gisandroidmysql.model;

import com.google.gson.annotations.SerializedName;

public class LocationModel {
//    @SerializedName("nama")
//    @SerializedName("latitude")
//    @SerializedName("longitude")

    private String longitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getImageLocationName() {
        return imageLocationName;
    }

    public void setImageLocationName(String imageLocationName) {
        this.imageLocationName = imageLocationName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    private String imageLocationName;
    private String latitude;

    public LocationModel (String imageLocationName, String latitude, String longitude) {
        this.imageLocationName = imageLocationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationModel (){

    }

}
