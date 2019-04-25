package com.myapplicationdev.android.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {


    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHolidayName;
    private ImageView ivIcon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvHolidayName = rowView.findViewById(R.id.tvHoliday);
        ivIcon = rowView.findViewById(R.id.ivIcon);


        Holiday currentHoliday = holiday.get(position);

        tvHolidayName.setText(currentHoliday.getName());

        if(currentHoliday.isChristmas()) {
            ivIcon.setImageResource(R.drawable.christmas);
        }
        else if(currentHoliday.isCny()) {
            ivIcon.setImageResource(R.drawable.cny);
        }
        else if(currentHoliday.isDeepavali()) {
            ivIcon.setImageResource(R.drawable.deepavali);
        }
        else if(currentHoliday.isGoodFriday()) {
            ivIcon.setImageResource(R.drawable.good_friday);
        }
        else if(currentHoliday.isHaji()) {
            ivIcon.setImageResource(R.drawable.hari_raya_haji);
        }
        else if(currentHoliday.isPuasa()) {
            ivIcon.setImageResource(R.drawable.hari_raya_puasa);
        }
        else if(currentHoliday.isLabour()) {
            ivIcon.setImageResource(R.drawable.labour_day);
        }
        else if(currentHoliday.isNationalDay()) {
            ivIcon.setImageResource(R.drawable.national_day);
        }
        else if(currentHoliday.isNewYear()) {
            ivIcon.setImageResource(R.drawable.new_year);
        }
        else {
            ivIcon.setImageResource(R.drawable.vesak_day);
        }

        return rowView;
    }


}


