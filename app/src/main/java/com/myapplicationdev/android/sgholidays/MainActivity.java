package com.myapplicationdev.android.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> aaCategory;
    ListView lvCategory;
    ArrayList<String> alCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCategory = findViewById(R.id.lvCategory);

        alCategory = new ArrayList<>();
        alCategory.add("Secular");

        lvCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, HolidayActivity.class);
                i.putExtra("category",position);
                startActivity(i);

            }
        });

        aaCategory = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alCategory);
        lvCategory.setAdapter(aaCategory);

    }
}
