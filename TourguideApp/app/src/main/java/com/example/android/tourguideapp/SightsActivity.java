package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<Object> object = new ArrayList<Object>();
        object.add(new Object("Tvrđava Brod", "Ulica Petra Krešimira IV BB"));
        object.add(new Object("Planinarski dom Đuro Pilar", "Šumica ulica 11"));
        object.add(new Object("Muzej Brodskog Posavlja", "Ulica Ante Starčevića 40"));
        object.add(new Object("Samostan Presvetog Trojstva", "Trg Svetog Trojstva 1"));
        object.add(new Object("Korzo", "Trg Ivane Brlić Mažuranić"));
        object.add(new Object("Kuća Brlićevih", "Trg Ivane Brlić Mažuranić"));
        object.add(new Object("Muzej Tambure", "Ulica Petra Krešimira IV BB"));



        ObjectAdapter objectAdapter = new ObjectAdapter(this, object, R.color.category_sights);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(objectAdapter);
    }
}

