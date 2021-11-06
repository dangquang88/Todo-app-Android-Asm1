package com.example.asm1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asm1.adapter.ToDo_ListRecycleAdapter;
import com.example.asm1.model.KwikListModelClass;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<KwikListModelClass> kwikListModelClasses;
    private RecyclerView recyclerView;
    private ToDo_ListRecycleAdapter bAdapter;

    Spinner spinner2;
    ProgressBar progressBar;
    private ActionBar toolbar;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        spinner2 = findViewById(R.id.spinner2);

        List<String> list = new ArrayList<String>();
        list.add("Weekly");
        list.add("Monthly");
        list.add("Yearly");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.spinner, R.id.spinner_text, list);
        spinner2.setAdapter(dataAdapter);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_addtask:
                    Intent intent1 = new Intent(MainActivity.this, Add_Task_Todo.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_todaytask:
                    Intent intent2 = new Intent(MainActivity.this, Today_Task_Todo.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };


}