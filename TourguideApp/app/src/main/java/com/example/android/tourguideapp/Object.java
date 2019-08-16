package com.example.android.tourguideapp;


/**
 * {@link Object} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Object {


    /**
     * NameOfObject
     */
    private String mObject;

    /**
     * LocationOfObject
     */
    private String mLocation;

    /**
     * Create a new Object object
     */
    public Object(String Object, String Location) {
        mObject = Object;
        mLocation = Location;
    }

    /**
     * Get the object.
     */
    public String getObject() {
        return mObject;
    }

    /**
     * Get the Location.
     */
    public String getLocation() {
        return mLocation;
    }

}

