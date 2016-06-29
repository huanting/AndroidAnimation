package com.hat.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/29.
 */
public class FrameAnimationActivity extends Activity {

    private ImageView mImgDance;
    private AnimationDrawable mAnimDrawble;
    private Button mStartBtn;
    private Button mStopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        initButton();
    }

    void initButton()
    {
        mImgDance = (ImageView)findViewById(R.id.ImgDance);
        mAnimDrawble = (AnimationDrawable)mImgDance.getBackground();
    }


    public void onStartDance(View view)
    {
        mAnimDrawble.start();
    }

    public void onStopDance(View view)
    {
        mAnimDrawble.stop();
    }
}
