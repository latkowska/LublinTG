package com.example.android.lublintg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.lublintg.R;
import com.example.android.lublintg.fragment.CultureFragment;
import com.example.android.lublintg.fragment.MuseumsFragment;

import java.util.ArrayList;

public class CultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new CultureFragment())
                .commit();
    }
}




