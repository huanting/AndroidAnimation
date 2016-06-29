package com.hat.animation;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ObjectAnimatorActivity extends Activity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        mImageView = (ImageView)findViewById(R.id.id_ball);
    }

    public void rotateyAnimRun(final View view)
    {
        //仅仅是旋转
//        ObjectAnimator.ofFloat(view, "rotationX", 0f, 360f)
//                .setDuration(500)
//                .start();

        //缩小和淡入淡出
//        final ObjectAnimator anim = ObjectAnimator.ofFloat(view, "hat", 1.0f, 0);
//        anim.setDuration(500);
//        anim.start();
//
//        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float cVal = (Float) animation.getAnimatedValue();
//                view.setAlpha(cVal);
//                view.setScaleX(cVal);
//                view.setScaleY(cVal);
//            }
//        });


        //缩小和淡入淡出
        PropertyValuesHolder hodler  = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.5f, 1.0f);
        PropertyValuesHolder hodlerX  = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.5f, 1.0f);
        PropertyValuesHolder hodlerY  = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.5f, 1.0f);
        ObjectAnimator.ofPropertyValuesHolder(view, hodler, hodlerX, hodlerY)
                .setDuration(1000)
                .start();



    }
}
