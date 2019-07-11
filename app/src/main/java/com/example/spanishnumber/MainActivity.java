package com.example.spanishnumber;

import androidx.appcompat.app.AppCompatActivity;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10;
    SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp= new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.one,1);
        sound2 = sp.load(getApplicationContext(),R.raw.two,1);
        sound3 = sp.load(getApplicationContext(),R.raw.three,1);
        sound4 = sp.load(getApplicationContext(),R.raw.four,1);
        sound5 = sp.load(getApplicationContext(),R.raw.five,1);
        sound6 = sp.load(getApplicationContext(),R.raw.six,1);
        sound7 = sp.load(getApplicationContext(),R.raw.seven,1);
        sound8 = sp.load(getApplicationContext(),R.raw.eight,1);
        sound9 = sp.load(getApplicationContext(),R.raw.nine,1);
        sound10 = sp.load(getApplicationContext(),R.raw.ten,1);

    }
    public void playsound1(View v){sp.play(sound1,1,1,0,0,1);}
    public void playsound2(View v){sp.play(sound2,1,1,0,0,1);}
    public void playsound3(View v){sp.play(sound3,1,1,0,0,1);}
    public void playsound4(View v){sp.play(sound4,1,1,0,0,1);}
    public void playsound5(View v){sp.play(sound5,1,1,0,0,1);}
    public void playsound6(View v){sp.play(sound6,1,1,0,0,1);}
    public void playsound7(View v){sp.play(sound7,1,1,0,0,1);}
    public void playsound8(View v){sp.play(sound8,1,1,0,0,1);}
    public void playsound9(View v){sp.play(sound9,1,1,0,0,1);}
    public void playsound10(View v){sp.play(sound10,1,1,0,0,1);}

}
