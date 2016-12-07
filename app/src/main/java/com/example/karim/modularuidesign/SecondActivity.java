package com.example.karim.modularuidesign;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        FragmentB f2 = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        if (f2 !=null)
            f2.changeData(index);
    }
}
