package com.example.adm.silastv;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SBTActivity extends AppCompatActivity {
    VideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbt);
        myVideoView = (VideoView)this.findViewById(R.id.myVideoView); MediaController mc = new MediaController(this); myVideoView.setMediaController(mc);
        final String urlStream = "http://gbbrlive2.sambatech.com.br:80/liveevent/sbtabr_8fcdc5f0f8df8d4de56b22a2c6660470/livestream2/live.m3u8";
        runOnUiThread(new Runnable() { @Override public void run() { myVideoView.setVideoURI(Uri.parse(urlStream)); } });
        myVideoView.start();
    }
}
