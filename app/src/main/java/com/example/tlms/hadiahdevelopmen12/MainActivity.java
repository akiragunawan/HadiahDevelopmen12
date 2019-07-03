package com.example.tlms.hadiahdevelopmen12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1;
ImageView img1;
MediaPlayer player;
int a = 0;


    @Override
    protected void onStart() {
        super.onStart();
        player.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        player.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               player = MediaPlayer.create(this, R.raw.lagu1);
        player.setLooping(true);
        player.start();
        if(player.isPlaying()){
            a = 1;
        }

        img1 = findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a == 1){
                    player.pause();
                    a= 0;
                    Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT).show();
                }else{
                    if(a==0){
                        player.start();
                        a= 1;
                        Toast.makeText(getApplicationContext(),"Playing",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                Intent intent = new Intent(MainActivity.this, com.example.tlms.hadiahdevelopmen12.kedua.class);
                startActivity(intent);

            }
        });




    }
}
