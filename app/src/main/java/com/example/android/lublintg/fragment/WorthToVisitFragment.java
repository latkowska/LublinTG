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
public class WorthToVisitFragment extends Fragment {


    public WorthToVisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create a list of places worth to visit
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Old Town", R.drawable.old_town));
        places.add(new Places("The Castle", R.drawable.castle));
        places.add(new Places("Trinitarian tower", R.drawable.tower));

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
