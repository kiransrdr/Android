package com.example.dell.activitylifecycletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class Calendar_View extends AppCompatActivity {
    CalendarView simpleCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar__view);
        simpleCalendarView = (CalendarView) findViewById(R.id.calendarView);
        simpleCalendarView.setDate(1463918226920L);
        simpleCalendarView.setFirstDayOfWeek(2);
        simpleCalendarView.setMaxDate(01/01/2018);//22 may 2016
        simpleCalendarView.setMinDate(01/01/2016);//13 may 2016
        simpleCalendarView.setShowWeekNumber(true);
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayofmonth) {
                Toast.makeText(getApplicationContext(),""+year+"/"+month+"/"+dayofmonth+"Date="+
                        simpleCalendarView.getDate()+"week firstday="+simpleCalendarView.getFirstDayOfWeek()
                        +"max date="+simpleCalendarView.getMaxDate()+"min date="+simpleCalendarView.getMinDate()
                        ,Toast.LENGTH_LONG).show();
            }
        });

    }
}
