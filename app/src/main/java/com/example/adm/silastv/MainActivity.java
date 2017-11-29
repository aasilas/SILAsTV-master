package com.example.adm.silastv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSBTActivity (View view){
        Intent sbtActivity = new Intent(this, SBTActivity.class);
        startActivity(sbtActivity);
    }

    public void startUCSALActivity (View view){
        Intent ucsalActivity = new Intent(this, UCSALActivity.class);
        startActivity(ucsalActivity);
    }
}
