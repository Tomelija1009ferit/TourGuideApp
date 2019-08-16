package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CafesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<Object> object = new ArrayList<Object>();
        object.add(new Object("Caffe Bar MINT", "Ulica Ivana Filipovića 8"));
        object.add(new Object("Caffe Bar Disco Club Alfa", "Ulica Ante Starčevića 19"));
        object.add(new Object("Caffe Bar Come Back", "Primorska Ulica 2"));
        object.add(new Object("Caffe Bar Stil", "Ulica Petra Krešimira IV 3"));
        object.add(new Object("Caffe Bar Gatsby", "Ulica Eugena Kumičića 49"));
        object.add(new Object("Caffe Bar Beerc", "Trg Ivane Brlić Mažuranić 9"));
        object.add(new Object("Caffe Bar Navigator", "Trg Ivane Brlić Mažuranić 13Z"));
        object.add(new Object("Caffe Bar Mojster", "Ulica Ante Starčevića 1"));
        object.add(new Object("Caffe Bar IMAGO", "Ulica Ante Starčevića 40"));
        object.add(new Object("Caffe Bar PONITA", "Uliva Andrije Štampara 41"));
        object.add(new Object("Caffe Bar PIGAL", "Ulica Eugena Kumičića 26"));
        object.add(new Object("Caffe Bar Dolar", "Vinogradska cesta 2F"));
        object.add(new Object("Caffe Bar Kum", "Ulica Petra Krešimira IV 37"));




        ObjectAdapter objectAdapter = new ObjectAdapter(this, object, R.color.category_cafes);



        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(objectAdapter);
    }
}

