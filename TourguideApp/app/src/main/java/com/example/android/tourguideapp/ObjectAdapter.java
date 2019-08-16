package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ObjectAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Object} objects.
 */
public class ObjectAdapter extends ArrayAdapter<Object> {


    private int mColorResourceId;

    /**
     * Create a new {@link ObjectAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param object is the list of {@link Object}s to be displayed.
     */
    public ObjectAdapter(Context context, ArrayList<Object> object, int ColorResourceId) {

        super(context, 0, object);

        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link object} object located at this position in the list
        Object currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_of_hotel.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_of_hotel);
        // Get the name from the currentWord object and set this text on
        // the name TextView.
        nameTextView.setText(currentObject.getObject());

        // Find the TextView in the list_item.xml layout with the ID address_of_hotel.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_of_hotel);
        // Get the adderss from the object and set this text on
        // the address TextView.
        addressTextView.setText(currentObject.getLocation());




        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
