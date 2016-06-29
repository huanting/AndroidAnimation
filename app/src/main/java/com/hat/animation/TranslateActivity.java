package com.hat.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/29.
 */
public class TranslateActivity extends Activity{
    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        mImageView = (ImageView)findViewById(R.id.trans_image);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        animation.setFillAfter(true);
        mImageView.startAnimation(animation);
    }


    public void translate(View view)
    {
        Animation anim = new TranslateAnimation(200, 0, 300, 0);
        anim.setDuration(2000);
        anim.setFillAfter(true);
        OvershootInterpolator overshoot = new OvershootInterpolator();
        anim.setInterpolator(overshoot);
        mImageView.startAnimation(anim);
    }
}
