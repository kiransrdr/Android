package com.example.dell.activitylifecycletest;

import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Image_view extends AppCompatActivity {
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        iv1=(ImageView)findViewById(R.id.imageView);
        iv1.setImageResource(R.drawable.d);
        iv1.setBackgroundColor(Color.BLACK);
        iv1.setPadding(40,30,30,40);

    }
}
