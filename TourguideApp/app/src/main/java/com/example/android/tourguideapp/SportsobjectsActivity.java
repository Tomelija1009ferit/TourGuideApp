package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsobjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Object> object = new ArrayList<Object>();
        object.add(new Object("Stadion NK MARSONIJA", "Šetalište Braće Radića 26"));
        object.add(new Object("Stadion NK Željezničar", "Aleja Miroslava Krleže 4"));
        object.add(new Object("Stadion NK Amater", "Ulica Martina Getaldića bb"));
        object.add(new Object("Stadion NK Budainka", "Trg Stjepana Radića 11"));
        object.add(new Object("Stadion NK Borac", "-----"));
        object.add(new Object("Stadion NK Ruščica", "-----"));
        object.add(new Object("Sportska dvorana Brod", "Ulica Eugena Kumičića BB"));
        object.add(new Object("Sportska dvorana Vijuš", "Stanka Vraza 2a"));
        object.add(new Object("Sportska Dvorana Bogoslav Šulek Livada", "Aleja Miroslava Krleže 2"));



        ObjectAdapter objectAdapter = new ObjectAdapter(this, object, R.color.category_sport_objects);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(objectAdapter);
    }
}
