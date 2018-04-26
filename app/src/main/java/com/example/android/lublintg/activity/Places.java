package com.example.android.lublintg.activity;

public class Places {

    //Name of the place
    private String tNameOfPlace;
    private int tImageResourceID;

    /**
     * Creating new object with one parameter in constructor.
     */

    public Places(String nameOfPlace) {
        tNameOfPlace = nameOfPlace;
    }

    /**
     * Create new object with two parameters in constructor.
     */

    public Places(String nameOfPlace, int imageResourceID) {
        tNameOfPlace = nameOfPlace;
        tImageResourceID = imageResourceID;
    }

    //Get name of the place
    public String gettNameOfPlace() {
        return tNameOfPlace;
    }

    //Get Image resource ID
    public int gettImageResourceID() {
        return tImageResourceID;
    }

}

