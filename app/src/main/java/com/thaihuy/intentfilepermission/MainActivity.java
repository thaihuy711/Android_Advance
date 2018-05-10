package com.thaihuy.intentfilepermission;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    static final String PATH_1 = "/Download/";
    static final String PATH_2 = "/DCIM/Camera";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        String ExternalStorage = Environment.getExternalStorageDirectory().getAbsolutePath();
        String path = ExternalStorage + PATH_2;
        File fileDirector = new File(path);
        File[] files =fileDirector.listFiles();

        ImageAdapter imageAdapter = new ImageAdapter(files);
        recyclerView.setAdapter(imageAdapter);
    }
}
