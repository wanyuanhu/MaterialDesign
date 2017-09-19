package com.learn.tang.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.learn.tang.material.widget.SunAnimationView;

/**
 * Created by Tang on 2017/9/19.
 */

public class SunAnimationActivity extends AppCompatActivity {
    Button button;
    SunAnimationView sumView;

    private String mCurrentTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun);
        initView();
    }

    private void initView()
    {
        mCurrentTime = "15:40";
        sumView = (SunAnimationView) findViewById(R.id.sun_view);
        button = (Button) findViewById(R.id.btn_set_time);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sumView.setTimes("05:10", "18:40", mCurrentTime);
                button.setText("当前时间：" + mCurrentTime);
            }
        });
    }
}
