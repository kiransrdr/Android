package com.example.dell.danishapplication;

import android.app.DownloadManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent implicitInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicitInt = new Intent();
    }

    public void google(View view) {
        implicitInt.setAction(Intent.ACTION_VIEW);
        implicitInt.setData(Uri.parse("http://www.google.com"));
        startActivity(implicitInt);
    }

    public void googlemap(View view) {
        implicitInt.setAction(Intent.ACTION_VIEW);
        implicitInt.setData(Uri.parse("geo:0,0?q=3.423156,-12.084917 "));
        startActivity(implicitInt);
    }

    public void dialer(View view) {
        implicitInt.setAction(Intent.ACTION_VIEW);
        implicitInt.setData(Uri.parse("tel: +923358765342"));
        startActivity(implicitInt);
    }

    public void mycontacts(View view) {
        implicitInt.setAction(android.content.Intent.ACTION_VIEW);
        implicitInt.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(implicitInt);
    }

    public void sendmessage(View view) {
        implicitInt.setAction(Intent.ACTION_VIEW);
        implicitInt.setData(Uri.parse("smsto: 923358765342"));
        implicitInt.putExtra("sms_body", "hello how are you");
        startActivity(implicitInt);
    }

    public void camera(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void messenger(View view) {
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(calIntent);
    }

    public void makevideo(View view) {
        Intent intent = new Intent();
        intent.setClassName("com.android.camera", "com.android.camera.VideoCamera");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, 1);
    }

    public void calender(View view) {
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(calIntent);
    }

    public  void voicesearch(View view) {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("com.google.android.googlequicksearchbox",
                "com.google.android.googlequicksearchbox.VoiceSearchActivity");

        startActivity(intent);

    }
    public  void setting(View view) {
         startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
    public  void datausage(View view) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$DataUsageSummaryActivity"));
        startActivity(intent);
    }
    public void downloads(View view) {
        startActivity(new Intent(DownloadManager.ACTION_VIEW_DOWNLOADS));
    }
    public void networks(View view) {
        startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
    }
    public void email(View view) {
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_EMAIL);
        startActivity(calIntent);
    }

    public void gallery(View view) {
        implicitInt.setAction(android.content.Intent.ACTION_GET_CONTENT);
        implicitInt.setType("image/*");
        implicitInt.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(implicitInt);
    }

    public void calculator(View view) {
        implicitInt.setClassName("com.android.calculator2", "com.android.calculator2.Calculator");
        startActivity(implicitInt);
    }
    public void wallpaper(View view) {
    Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
    startActivity(Intent.createChooser(intent, "Select Wallpaper"));
        startActivity(intent);
}


}
