package com.valerio.android.borrarlo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.valerio.android.borrarlo.Activity.IntroActivity;
import com.valerio.android.borrarlo.databinding.ActivityLogoBinding;


public class LogoActivity extends AppCompatActivity {

    ActivityLogoBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mBinding = ActivityLogoBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        mBinding.appname.animate().translationX(-2000).setDuration(2000).setStartDelay(4000);
        mBinding.lottie.animate().translationX(2000).setDuration(2000).setStartDelay(4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);


    }
}