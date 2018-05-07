package com.thaihuy.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Food> foodArrayList = new ArrayList<>();
        foodArrayList.add(new Food("Món 1",R.drawable.img1));
        foodArrayList.add(new Food("Món 2",R.drawable.img2));
        foodArrayList.add(new Food("Món 3",R.drawable.img3));
        foodArrayList.add(new Food("Món 4",R.drawable.img4));
        foodArrayList.add(new Food("Món 5",R.drawable.img5));

        FoodAdapter foodAdapter = new FoodAdapter(foodArrayList,getApplicationContext());
        recyclerView.setAdapter(foodAdapter);
    }
}
