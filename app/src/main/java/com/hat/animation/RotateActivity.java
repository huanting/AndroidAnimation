package com.hat.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/6/29.
 */
public class RotateActivity extends Activity {

    private ImageView mImageView;
    private int currAngle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        mImageView = (ImageView)findViewById(R.id.piechart);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animation.setFillAfter(true);
        mImageView.startAnimation(animation);
    }

    public void positive(View view)
    {
        RotateAnimation animation = new RotateAnimation( currAngle, currAngle + 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        LinearInterpolator li = new LinearInterpolator();
        animation.setInterpolator(li);
        animation.setDuration(1000);

        animation.setFillAfter(true);
        currAngle += 180;
        if (currAngle > 360) {
            currAngle = currAngle - 360;
        }

        mImageView.startAnimation(animation);


    }

    public void negative(View view)
    {
        RotateAnimation animation = new RotateAnimation( currAngle, currAngle - 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        LinearInterpolator li = new LinearInterpolator();
        animation.setInterpolator(li);
        animation.setDuration(1000);

        animation.setFillAfter(true);
        currAngle -= 180;
        if (currAngle < -360) {
            currAngle = currAngle + 360;
        }

        mImageView.startAnimation(animation);

    }

}
