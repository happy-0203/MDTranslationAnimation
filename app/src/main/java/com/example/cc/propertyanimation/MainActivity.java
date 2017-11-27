package com.example.cc.propertyanimation;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn = findViewById(R.id.btn);

        mIv = findViewById(R.id.iv);
    }

    public void startAnimator(View view) {

//        ObjectAnimator animator = ObjectAnimator.ofFloat(mIv, "rotation", 0, 360f);
//
//        animator.setDuration(500);
//        animator.start();

//        ValueAnimator animator = ValueAnimator.ofFloat(0,200f);
//        animator.setDuration(5000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//               float value = (float) animation.getAnimatedValue();
//                Log.d("123","value:"+value);
//                mIv.setScaleX(0.5f+value/200);
//                mIv.setScaleY(0.5f+value/200);
//            }
//        });
//
//        animator.start();

//        PropertyValuesHolder alpha = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.5f, 1.0f);
//        PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.5f, 1.0f);
//        PropertyValuesHolder scaleY = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.5f, 1.0f);
//        PropertyValuesHolder translationY = PropertyValuesHolder.ofFloat("translationY", 0f, 50f);
//
//
//        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(mIv, alpha, scaleX, scaleY,translationY);
//        animator.setDuration(5000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//
//            }
//        });
//        animator.start();

//        ObjectAnimator alpha = ObjectAnimator.ofFloat(mIv, "alpha", 1.0f, 0.5f, 1.0f);
//        ObjectAnimator scaleX = ObjectAnimator.ofFloat(mIv, "scaleX", 1.0f, 0.5f, 1.0f);
//        ObjectAnimator scaleY = ObjectAnimator.ofFloat(mIv, "scaleY", 1.0f, 0.5f, 1.0f);
//        ObjectAnimator translationY = ObjectAnimator.ofFloat(mIv, "translationY", 0f, 50f);
//
//        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.setDuration(5000);
//        //animatorSet.playSequentially(alpha,scaleX,scaleY,translationY);
//        animatorSet.playTogether(alpha,scaleX,scaleY,translationY);
//        animatorSet.start();


        //抛物线
        ValueAnimator valueAnimator = new ValueAnimator();

        valueAnimator.setDuration(4000);

        valueAnimator.setObjectValues(new PointF(0, 0));

        valueAnimator.setEvaluator(new TypeEvaluator<PointF>() {
            @Override
            public PointF evaluate(float fraction, PointF startValue, PointF endValue) {

                PointF pointF = new PointF();

                pointF.x = 20f * fraction * 40;

                pointF.y =  0.5f * 10f + (40 * fraction)*(40*fraction);

                return pointF;
            }
        });

        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {


                PointF pointF = (PointF) animation.getAnimatedValue();
                mIv.setX(pointF.x);
                mIv.setY(pointF.y);
            }
        });

        valueAnimator.start();


    }
}
