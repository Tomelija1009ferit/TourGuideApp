package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WhatWeOfferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_we_offer);



        // Find the View that shows the hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hotels View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(WhatWeOfferActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        // Find the View that shows the cafes category
        TextView cafes = (TextView) findViewById(R.id.cafes);

        // Set a click listener on that View
        cafes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the cafes View is clicked on.
            @Override
            public void onClick(View view) {
                Intent cafesIntent = new Intent(WhatWeOfferActivity.this, CafesActivity.class);
                startActivity(cafesIntent);
            }
        });


        // Find the View that shows the sights category
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set a click listener on that View
        sights.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sights View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sightsIntent = new Intent(WhatWeOfferActivity.this, SightsActivity.class);
                startActivity(sightsIntent);
            }
        });


        // Find the View that shows the sportobjects category
        TextView sportobjects = (TextView) findViewById(R.id.sport_objects);

        // Set a click listener on that View
        sportobjects.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sportobject View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sportobjectsIntent = new Intent(WhatWeOfferActivity.this, SportsobjectsActivity.class);
                startActivity(sportobjectsIntent);
            }
        });
    }
}
