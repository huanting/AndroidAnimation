package com.hat.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/6/29.
 */
public class PropertyAnimationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
    }

    public void onClickObject(View view)
    {
        Intent intent = new Intent(PropertyAnimationActivity.this, ObjectAnimatorActivity.class);
        startActivity(intent);
    }

    public void onClickValue(View view)
    {
        Intent intent = new Intent(PropertyAnimationActivity.this, ValueAnimatorActivity.class);
        startActivity(intent);
    }

    public void onClickAnimatorSet(View view)
    {
        Intent intent = new Intent(PropertyAnimationActivity.this, AnimatorSetActivity.class);
        startActivity(intent);
    }
}
