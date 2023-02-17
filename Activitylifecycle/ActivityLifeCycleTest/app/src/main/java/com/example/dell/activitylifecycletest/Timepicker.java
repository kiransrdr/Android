package com.example.dell.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class Timepicker extends AppCompatActivity {
    TimePicker tp1;
    TimePicker tp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);
        tp1=(TimePicker)findViewById(R.id.timePicker);
        tp1.setCurrentHour(5);
        tp1.setCurrentMinute(5);
        tp1.setIs24HourView(true);
        tp1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
                boolean timeformat=tp1.is24HourView();
                Toast.makeText(getApplicationContext(),"Hr:"+hourOfDay+" Min:"+minute+" Format"+timeformat,Toast.LENGTH_SHORT).show();

            }
        });

        tp2=(TimePicker)findViewById(R.id.timePicker2);
        tp2.setCurrentHour(12);
        tp2.setCurrentMinute(2);
        tp2.setIs24HourView(false);
        tp2.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener(){
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
                boolean timeformat=tp2.is24HourView();
                Toast.makeText(getApplicationContext(),"Hr:"+hourOfDay+" Min:"+minute+" Format"+timeformat,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
