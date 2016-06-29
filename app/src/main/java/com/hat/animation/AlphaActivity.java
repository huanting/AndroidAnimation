package com.hat.animation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/29.
 */
public class AlphaActivity extends Activity implements Animation.AnimationListener {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        mImageView = (ImageView)findViewById(R.id.splash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animation.setFillAfter(true);
        animation.setAnimationListener(this);
        mImageView.startAnimation(animation);
    }

    public void alpha(View view)
    {
        AlphaAnimation anim = new AlphaAnimation(1.0f, 0.0f);
        anim.setDuration(3000);
        anim.setFillAfter(true);
        mImageView.startAnimation(anim);
    }
    @Override
    public void onAnimationStart(Animation animation) {
        Log.i("alpha", "onAnimationStart called.");
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Log.i("alpha", "onAnimationEnd called");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Log.i("alpha", "onAnimationRepeat called");
    }
}
