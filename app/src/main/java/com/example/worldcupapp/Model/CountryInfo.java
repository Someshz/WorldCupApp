package com.example.worldcupapp.Model;

public class CountryInfo {
    private int imageUrl;
    private String countryName;
    private String cupCount;

    public CountryInfo(int imageUrl, String countryName, String cupCount) {
        this.imageUrl = imageUrl;
        this.countryName = countryName;
        this.cupCount = cupCount;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public String getCountryName() {
        return countryName;
    }


    public String getCupCount() {
        return cupCount;
    }

}
