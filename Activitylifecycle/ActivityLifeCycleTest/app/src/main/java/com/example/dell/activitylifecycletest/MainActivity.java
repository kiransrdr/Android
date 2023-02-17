package com.example.dell.activitylifecycletest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText);
        /* if (savedInstanceState != null) {
            String msg = savedInstanceState.getString("msg");
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }*/
    }

    public void onSpinnerbtnClick(View v){//implemeted Alert dialog on spinner btn before spinner activity opens
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Confirm Go!!");
        alert.setIcon(R.drawable.question);
        alert.setMessage("Are you sure??");
        alert.setCancelable(false);
        alert.setPositiveButton("Go",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               //Toast.makeText(getApplicationContext(),"Go",Toast.LENGTH_LONG).show();
                Intent intent =new Intent(getApplicationContext(),Main2Activity.class);//spinner activity
                startActivity(intent);
            }
        });
        alert.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"cancelled",Toast.LENGTH_LONG).show();

            }
        });
        alert.show();
    }

    public void ontTmePickerbtnClick(View v){
        Intent i =new Intent(this,Timepicker.class);// direct to timepicker activity
        startActivity(i);
    }

    public void onDatePickerbtnClick(View v){
        Intent i =new Intent(this,Date_picker.class);//direct to date picker activity
        startActivity(i);
    }

    public void onSCalendarViewbtnClick(View v){
        Intent i =new Intent(this,Calendar_View.class);//direct to calander activity
        startActivity(i);
    }

    public void onImageViewbtnClick(View v){
        Intent i =new Intent(this,Image_view.class);//direct to image view activity
        startActivity(i);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) { //trying to store current state of activity before going to another activity
        outState.putString("msg","hello");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {//not working
        super.onRestoreInstanceState(savedInstanceState);
        String msg=savedInstanceState.getString("msg");
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        Log.i("msg",msg);
    }
//activity life cycle
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("tag","activity1 on start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("tag","activity1  on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("tag","activity1 on restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("tag","activity1 on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","activity1 on destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("tag", "activity1  on resume");
    }
}
