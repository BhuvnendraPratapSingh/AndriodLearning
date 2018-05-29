package com.android.bignerdranch.android.databindingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private  RecyclerView recyclerView;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<TemperatureData> items =
                Arrays.asList(new TemperatureData("Hamburg", "5"), new TemperatureData("Berlin", "6"));
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}
