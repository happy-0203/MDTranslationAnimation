package com.example.mdanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = findViewById(R.id.btn);
        mImageView = findViewById(R.id.iv);
    }

    public void startAnimation(View view) {

        Animator circularReveal = ViewAnimationUtils.createCircularReveal(mImageView, mImageView.getWidth() / 2, mImageView.getHeight() / 2, 0, mImageView.getHeight() / 2);
        circularReveal.setDuration(5000);

        circularReveal.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mImageView.setVisibility(View.VISIBLE);
            }
        });

        circularReveal.start();
    }
}
