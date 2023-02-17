package com.example.dell.dynamicbuttons;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout mylayout = new TableLayout(this);
        ScrollView scrollView = new ScrollView(this);
        mylayout.setBackgroundColor(Color.LTGRAY);

        //Intput Text
        final TextView mytv = new TextView(this);
        mytv.setText(" Using TextBox");
        mytv.setTextColor(Color.RED);
        mytv.setTextSize(23);
        mylayout.addView(mytv);

        final EditText et = new EditText(this);
        mylayout.addView(et);

        Button mybutton = new Button(this);
        mybutton.setText("Click");
        mylayout.addView(mybutton);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("count", "0"+et.getText().toString());
                startActivity(intent);
            }
        });

        //Radio button to add buttons dynamically
        final TextView myradiotextview = new TextView(this);
        myradiotextview.setText("Using Radio ");
        myradiotextview.setTextColor(Color.RED);
        myradiotextview.setTextSize(23);
        mylayout.addView(myradiotextview);

        RadioGroup radiogroup = new RadioGroup(getApplicationContext());
        radiogroup.setOrientation(RadioGroup.HORIZONTAL);
        for (int i = 1; i <=3; i++) {
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

        //checkbox to add button dynamically
        final TextView mychckbxtv = new TextView(this);
        mychckbxtv.setText(" Using TextBox");
        mychckbxtv.setTextColor(Color.RED);
        mychckbxtv.setTextSize(23);
        mylayout.addView(mychckbxtv);

        GridLayout cbgrid=new GridLayout(this);
        cbgrid.setColumnCount(3);
        for (int i = 1; i <=3; i++) {
            CheckBox chchbx = new CheckBox(this);
            chchbx.setText("ChecBox" + i);
            chchbx.setId(i);
            cbgrid.addView(chchbx);
            final int finalI = i;
            chchbx.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent.putExtra("count", "0"+finalI);
                    startActivity(intent);
                }
            });
        }
        mylayout.addView(cbgrid);

        //Spinner
        final TextView mysptv = new TextView(this);
        mysptv.setText(" Using Spinner");
        mysptv.setTextColor(Color.RED);
        mysptv.setTextSize(23);
        mylayout.addView(mysptv);

        Spinner sp = new Spinner(this);

        List<String> categories = new ArrayList<String>();
        categories.add("1Button");
        categories.add("2 Button");
        categories.add("3 Button");
        categories.add("5 Button");
        categories.add("10 Button");
        categories.add("20 Button");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        sp.setAdapter(dataAdapter);
        mylayout.addView(sp);
        int id= (int) sp.getSelectedItemId();
        Log.i("msg"," id="+id);


        scrollView.addView(mylayout);
        setContentView(scrollView) ;
        intent = new Intent(MainActivity.this, ButtonsActivity.class);


    }


}
