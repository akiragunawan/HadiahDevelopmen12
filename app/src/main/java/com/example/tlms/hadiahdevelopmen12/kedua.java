package com.example.tlms.hadiahdevelopmen12;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class kedua extends AppCompatActivity {

MediaPlayer player1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        player1 = MediaPlayer.create(this, R.raw.lagu2);
        player1.setLooping(true);
        player1.start();
            }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        player1.stop();

    }

  }
