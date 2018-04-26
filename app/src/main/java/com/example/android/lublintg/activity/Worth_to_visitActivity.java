package com.example.android.lublintg.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.lublintg.R;
import com.example.android.lublintg.fragment.WorthToVisitFragment;

import java.util.ArrayList;

public class Worth_to_visitActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_worth_to_visit);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new WorthToVisitFragment())
                    .commit();
        }
    }


