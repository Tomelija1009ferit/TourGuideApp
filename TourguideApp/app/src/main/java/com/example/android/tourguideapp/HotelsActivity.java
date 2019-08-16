package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of hotels
        ArrayList<Object> object = new ArrayList<Object>();
        object.add(new Object("Art Hotel", "Ulica Nikole Zrinskog 44"));
        object.add(new Object("Hotel Savus", "Ulica Doktora Ante Starčevića 2a"));
        object.add(new Object("Hotel Levicki", "Trg Stjepana Miletića 11"));
        object.add(new Object("Hotel Central", "Trg Stjepana Radića 11"));
        object.add(new Object("Sava Apartmans", "Ulica Petra Krešimira IV 45a"));
        object.add(new Object("Apartmans Moto Club Brod", "Primorska ulica 13"));
        object.add(new Object("Apartmans Crnjac", "Ulica Davorina Bazijanca 4"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ObjectAdapter objectAdapter = new ObjectAdapter(this, object, R.color.category_hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(objectAdapter);
    }
}
