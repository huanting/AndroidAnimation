package com.hat.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ScaleActivity extends Activity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        mImageView = (ImageView)findViewById(R.id.scale_image);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        animation.setFillAfter(true);
        mImageView.startAnimation(animation);
    }


    public void sclae(View view)
    {
        Animation anim = new ScaleAnimation(2.0f, 1.0f, 2.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(2000);
        anim.setFillAfter(true);
        BounceInterpolator bounce = new BounceInterpolator();
        anim.setInterpolator(bounce);
        mImageView.startAnimation(anim);
    }


}
