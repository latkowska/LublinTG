package com.example.android.lublintg.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.lublintg.R;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_wtv, parent, false);
        }

        // Get the position of the object located at this
        Places currentPlace = getItem(position);

        // Find the TextView in the list_item_wtv.xml layout with the propoer ID
        TextView nameOfPlaceTextView = (TextView) listItemView.findViewById(R.id.nameOfPlace_TextView);

        nameOfPlaceTextView.setText(currentPlace.gettNameOfPlace());

        // Find the ImageView in the list_item_wtv.xml layout with the ID image.
        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture_ImageView);

        pictureImageView.setImageResource(currentPlace.gettImageResourceID());

        return listItemView;
    }
}


