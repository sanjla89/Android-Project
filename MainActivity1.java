package com.my.company;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RecyclerView find
        recyclerView = findViewById(R.id.recyclerView);

        // List create
        list = new ArrayList<>();

        // Data add
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        // LayoutManager
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        // Adapter set
        adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
