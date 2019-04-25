package com.myapplicationdev.android.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HolidayActivity extends AppCompatActivity {

    ListView lvHoliday;
    TextView tvTitle;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);

        lvHoliday = this.findViewById(R.id.lvHoliday);
        tvTitle = this.findViewById(R.id.tvTitle);

        Intent i = getIntent();
        int position = i.getIntExtra("category",0);

        holiday = new ArrayList<>();

        if(position == 0) {
            tvTitle.setText("Secular");
            holiday.add(new Holiday("New Year's Day", false, false, false, false, false, false, false, false, true, false));
            aa = new HolidayAdapter(this, R.layout.row, holiday);
            lvHoliday.setAdapter(aa);
        }

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holiday.get(position);

                Toast.makeText(HolidayActivity.this, selectedHoliday.getName() + " Date: 1 Jan 2017" + selectedHoliday.isNewYear(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
