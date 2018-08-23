package com.example.android.lublintg.activity;

public class Places {

    //Name of the place
    private int mNameOfPlace;
    private int mImageResourceID;

    /**
     * Creating new object with one parameter in constructor, if we want to use list item without pictures.
     */

    public Places(int nameOfPlace) {
        mNameOfPlace = nameOfPlace;
    }

    /**
     * Create new object with two parameters in constructor.
     */

    public Places(int nameOfPlace, int imageResourceID) {
        mNameOfPlace = nameOfPlace;
        mImageResourceID = imageResourceID;
    }

    //Get name of the place
    public int gettNameOfPlace() {
        return mNameOfPlace;
    }

    //Get Image resource ID
    public int gettImageResourceID() {
        return mImageResourceID;
    }

}

