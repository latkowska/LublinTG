package com.example.android.lublintg.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.lublintg.R;
import com.example.android.lublintg.activity.OldTownActivity;
import com.example.android.lublintg.activity.Places;
import com.example.android.lublintg.activity.PlacesAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //ArrayList of museums

        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("The State Museum at Majdanek", R.drawable.majdanek));
        places.add(new Places("The Open Air Village Museum", R.drawable.mwsi));
        places.add(new Places("The Lublin Museum", R.drawable.mcastle));

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

        return listView; //or rootView?
    }


    }


