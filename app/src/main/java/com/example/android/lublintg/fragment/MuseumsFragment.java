package com.example.android.lublintg.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.lublintg.R;
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
        View rootView = inflater.inflate(R.layout.fragment_museums, container, false);

        //ArrayList of museums

        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.majdanek, R.drawable.majdanek));
        places.add(new Places(R.string.village, R.drawable.mwsi));
        places.add(new Places(R.string.cmus, R.drawable.mcastle));

        //Create an adapter
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        //Finding list view in xmlfile
        ListView listView = (ListView) rootView.findViewById(R.id.item_list_wtv);

        //setting adapter on the list
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Museums");

    }

}


