package com.markit.bb.markit.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.markit.bb.markit.R;

import org.jetbrains.annotations.NotNull;

public class IntroductionActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN = 4000;

    ImageView intro_img, intro_logo;
    TextView text_logo;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        intro_img = findViewById(R.id.intro_img);
        intro_logo = findViewById(R.id.intro_logo);
        text_logo = findViewById(R.id.text_logo);
        lottieAnimationView = findViewById(R.id.lottie_intro);


        intro_img.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        intro_logo.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        text_logo.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(2000).setDuration(1000).setStartDelay(4000);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(IntroductionActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_SCREEN);

    }




}
