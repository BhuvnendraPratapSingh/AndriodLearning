package com.android.bignerdranch.android.databindingdemo;

import android.databinding.BindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private  RecyclerView recyclerView;
    private MyAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<TemperatureData> items =
                Arrays.asList(
                        new TemperatureData("Hamburg", "5", "http://pic1.win4000.com/wallpaper/4/53d71b942a18a.jpg"),
                        new TemperatureData("Berlin", "6","http://pic1.win4000.com/wallpaper/4/53d71b9a76bdb.jpg"));
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext()).
                load(url).
                placeholder(R.mipmap.ic_launcher).
                into(view);
    }
}
