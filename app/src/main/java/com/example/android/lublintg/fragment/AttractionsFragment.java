package com.example.android.lublintg.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.lublintg.R;
import com.example.android.lublintg.activity.OldTownActivity;
import com.example.android.lublintg.activity.Places;
import com.example.android.lublintg.activity.PlacesAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of places
        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places("Aqua Lublin", R.drawable.aqua));
        places.add(new Places("Sport stadium - Arena Lublin", R.drawable.arena));
        places.add(new Places("Speedway stadium Motor Lublin", R.drawable.speedway));

        //Create an adapter
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        //Finding list view in xmlfile
        ListView listView = (ListView) rootView.findViewById(R.id.item_list_wtv);

        //setting adapter on the list
        listView.setAdapter(adapter);

        //setting onClickListener on items of ArrayList
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent oldTown = new Intent(getActivity(), OldTownActivity.class);
                startActivity(oldTown);
            }
        });
        return listView; //rootView?
    }
}