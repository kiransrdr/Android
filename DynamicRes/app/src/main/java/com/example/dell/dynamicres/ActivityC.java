package com.example.dell.dynamicres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity {
Intent explicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        GridLayout gridLayout = new GridLayout(this);
        explicitintent=new Intent();
        //explicitintent.getExtras();
        explicitintent = getIntent();
        String val = explicitintent.getStringExtra("count").toString();
        Log.i("Message",val);
        scrollView.addView(gridLayout);
        setContentView(scrollView);
        setContentView(R.layout.activity_c);
    }
}
