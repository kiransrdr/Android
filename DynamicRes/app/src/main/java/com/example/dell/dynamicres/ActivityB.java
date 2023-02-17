package com.example.dell.dynamicres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by DELL on 11/26/2017.
 */
public class ActivityB extends AppCompatActivity {
    Intent explicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        GridLayout gridLayout = new GridLayout(this);
        explicitintent=new Intent();
        explicitintent = getIntent();
        int val = Integer.parseInt(explicitintent.getStringExtra("count").toString());
        //printing value
        scrollView.addView(gridLayout);
        setContentView(scrollView);
    }
}
