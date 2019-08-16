package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        Button ClickToFind = (Button) findViewById(R.id.click_to_find);

        // Set a click listener on that View
        ClickToFind.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the clicktofind View is clicked on.
            @Override
            public void onClick(View view) {
                Intent clicktofinsIntent = new Intent(MainActivity.this, WhatWeOfferActivity.class);
                startActivity(clicktofinsIntent);
            }
        });
    }
}