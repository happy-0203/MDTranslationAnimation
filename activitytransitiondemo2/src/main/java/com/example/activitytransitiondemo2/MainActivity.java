package com.example.activitytransitiondemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mIv = findViewById(R.id.iv);
    }

    public void startNewActivity(View view) {

//        Slide slide = new Slide();
//        getWindow().setExitTransition(slide);
//        getWindow().setEnterTransition(slide);

//        Explode explode = new Explode();
//        explode.setDuration(100);
//        getWindow().setExitTransition(explode);
//        getWindow().setEnterTransition(explode);


        Fade fade = new Fade();
        fade.setDuration(500);
        getWindow().setExitTransition(fade);
        getWindow().setEnterTransition(fade);

        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent,optionsCompat.toBundle());
    }
}
