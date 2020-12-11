package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AreadataActivity extends AppCompatActivity {

    private ArrayList<String> noArea = new ArrayList<>();
    private ArrayList<String> areaProductCode = new ArrayList<>();
    private ArrayList<String> areaProductName = new ArrayList<>();
    private ArrayList<String> areaReceive = new ArrayList<>();
    private ArrayList<String> areaIssue = new ArrayList<>();
    private ArrayList<String> areaBalance = new ArrayList<>();
    private String uId ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areadata);
    }

    private void iniRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view_area_detail);
        AreaAdapter adapter = new AreaAdapter(noArea,areaProductCode,areaProductName,areaReceive,areaIssue,areaBalance,uId,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}