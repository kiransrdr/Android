package com.example.dell.dynamicres;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityA extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout mylayout = new TableLayout(this);
        ScrollView scrollView = new ScrollView(this);
        mylayout.setBackgroundColor(Color.LTGRAY);

        final TextView mytv = new TextView(this);
        mytv.setTextSize(23);
        mylayout.addView(mytv);
        final EditText edittxt = new EditText(this);
        mylayout.addView(edittxt);

        Button mybutton = new Button(this);
        mybutton.setText("Submit");
        mylayout.addView(mybutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("count", "0"+edittxt.getText().toString());
                startActivity(intent);
            }
        });

        final TextView myradiotextview = new TextView(this);
        myradiotextview.setTextSize(23);
        mylayout.addView(myradiotextview);
        RadioGroup radiogroup = new RadioGroup(getApplicationContext());
        radiogroup.setOrientation(RadioGroup.HORIZONTAL);
        for (int i = 1; i <=5; i++) {
            RadioButton radio = new RadioButton(this);
            radio.setText("Buttons" + i);
            radio.setId(i);
            radiogroup.addView(radio);
            final int finalI = i;
            radio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent.putExtra("count", "0"+finalI);
                    startActivity(intent);
                }
            });
        }
        mylayout.addView(radiogroup);

        final TextView mychtv = new TextView(this);
        mychtv.setText(" Using TextBox") ;
        mylayout.addView(mychtv);

        GridLayout grid=new GridLayout(this);
        grid.setColumnCount(3);
        for (int i = 1; i <=3; i++) {
            CheckBox chchbx = new CheckBox(this);
            chchbx.setText("ChecBox" + i);
            chchbx.setId(i);
            grid.addView(chchbx);
            final int finalI = i;
            chchbx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent.putExtra("count", "0"+finalI);
                    startActivity(intent);
                }
            });
        }
        mylayout.addView(grid);





        scrollView.addView(mylayout);
        setContentView(scrollView) ;
        intent = new Intent(ActivityA.this, ActivityC.class);



    }
    }
