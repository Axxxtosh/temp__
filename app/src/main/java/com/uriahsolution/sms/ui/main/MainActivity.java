package com.uriahsolution.sms.ui.main;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.uriahsolution.sms.R;
import com.uriahsolution.sms.ui.attendance.AttendanceActivity;
import com.uriahsolution.sms.ui.busTracking.MapsActivity;
import com.uriahsolution.sms.ui.fees.ScrollingActivity;
import com.uriahsolution.sms.ui.timetable.TimeTableActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.timetable_ll)
    LinearLayout timeTableLinear;
    @BindView(R.id.celen)
    LinearLayout celenderLinear;
    @BindView(R.id.circular)
    LinearLayout circularLinear;
    @BindView(R.id.homework)
    LinearLayout homework;
    @BindView(R.id.remarks)
    LinearLayout maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        timeTableLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TimeTableActivity.class);
                startActivity(intent);

            }
        });

        celenderLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });
        circularLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
        homework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }

    private void setupViewPager(ViewPager viewPager) {


    }
}
