package com.example.activitytransitiondemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Slide slide = new Slide();
//        getWindow().setExitTransition(slide);
//        getWindow().setEnterTransition(slide);

//        Explode explode = new Explode();
//        explode.setDuration(100);
//        getWindow().setExitTransition(explode);
//        getWindow().setEnterTransition(explode);


        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setExitTransition(fade);
        getWindow().setEnterTransition(fade);
    }
}
