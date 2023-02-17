package com.example.dell.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class Date_picker extends AppCompatActivity {
    DatePicker simpleDatePicker;
    DatePicker simpleDatePicker2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        simpleDatePicker=(DatePicker)findViewById(R.id.datePicker);
        //simpleDatePicker.setSpinnersShown(false);
        simpleDatePicker.setOnClickListener(new DatePicker.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),simpleDatePicker.getDayOfMonth() + "\n" + simpleDatePicker.getMonth() + "\n" + simpleDatePicker.getYear(),Toast.LENGTH_LONG).show();
            }
        });
        simpleDatePicker2=(DatePicker)findViewById(R.id.datePicker2);
        //simpleDatePicker.setSpinnersShown(false);
        simpleDatePicker2.setOnClickListener(new DatePicker.OnClickListener(){
                                                @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),simpleDatePicker2.getDayOfMonth() + "\n" + simpleDatePicker2.getMonth() + "\n" + simpleDatePicker2.getYear(),Toast.LENGTH_LONG).show();

            }
                                            }

        );

    }
}
