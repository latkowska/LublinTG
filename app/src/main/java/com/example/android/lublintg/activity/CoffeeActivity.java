package com.example.android.lublintg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.lublintg.R;
import com.example.android.lublintg.fragment.CoffeeFragment;
import com.example.android.lublintg.fragment.MuseumsFragment;

import java.util.ArrayList;

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new CoffeeFragment())
                .commit();
    }
}


