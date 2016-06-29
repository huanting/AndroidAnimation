package com.hat.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/6/29.
 */
public class TweenAnimationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
    }

    public void onClickRotate(View view)
    {
        Intent intent = new Intent(TweenAnimationActivity.this, RotateActivity.class);
        startActivity(intent);
    }

    public void onClickAlpha(View view)
    {
        Intent intent = new Intent(TweenAnimationActivity.this, AlphaActivity.class);
        startActivity(intent);
    }

    public void onClickTranslate(View view)
    {
        Intent intent = new Intent(TweenAnimationActivity.this, TranslateActivity.class);
        startActivity(intent);
    }

    public void onClickScale(View view)
    {
        Intent intent = new Intent(TweenAnimationActivity.this, ScaleActivity.class);
        startActivity(intent);
    }

}
