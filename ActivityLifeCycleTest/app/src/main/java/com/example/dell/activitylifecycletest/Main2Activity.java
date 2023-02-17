package com.example.dell.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //spinner 1
        spinner1=(Spinner)findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(),
                        "OnItemSelectedListener : "+adapterView.getItemIdAtPosition(i),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(adapterView.getContext(),"nothing selectedd : ",Toast.LENGTH_LONG).show();

            }
        });
        //spinner2
        addItemsOnSpinner2();
    }
    public void addItemsOnSpinner2(){
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String>  list=new ArrayList<String>();
        list.add("Pak");
        list.add("China");
        list.add("Iran");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        spinner2.setAdapter(dataAdapter);
    }

    public void onbtnClick(View v){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag","activity2 on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag","activity2 on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("tag","activity2  on restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag","activity2 on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","activity2 on destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag","activity2 on resume");

    }
}
