package com.example.dell.dynamicbuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity {
    Intent explicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        GridLayout gridLayout = new GridLayout(this);
        Log.i("msg","class b");
        explicitintent=new Intent();
        //explicitintent.getExtras();
        explicitintent = getIntent();
        int number = Integer.parseInt(explicitintent.getStringExtra("count").toString());
        Button btns[] = new Button[number];
        gridLayout.setColumnCount(3);

        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button(this);
            btns[i].setText("Button no  : "+String.valueOf(i + 1));
            gridLayout.addView(btns[i]);
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Button#" + ((Button) v).getText() + "Clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
        scrollView.addView(gridLayout);
        setContentView(scrollView);
    }
}
