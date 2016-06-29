package com.hat.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFrame(View view)
    {
        Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
        startActivity(intent);
    }

    public void onClickTween(View view)
    {
        Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
        startActivity(intent);
    }

    public void onClickProperty(View view)
    {
        Intent intent = new Intent(MainActivity.this, PropertyAnimationActivity.class);
        startActivity(intent);
    }
}
