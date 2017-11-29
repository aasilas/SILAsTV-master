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
        final String urlStream = "http://caikrondatacenter.com.br:1935/tvaparecida/tvaparecida.stream/Paz.m3u8";
        //final String urlStream= "https://ead.ucsal.br/login/index.php";
        runOnUiThread(new Runnable() { @Override public void run() { myVideoView.setVideoURI(Uri.parse(urlStream)); } });
        myVideoView.start();
    }
}
