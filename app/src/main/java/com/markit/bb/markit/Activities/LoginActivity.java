package com.markit.bb.markit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.markit.bb.markit.LoginFragmentAdapter;
import com.markit.bb.markit.R;

public class LoginActivity extends AppCompatActivity {

    TabLayout tab_layout;
    ViewPager2 viewPager2;
    FloatingActionButton fb,google,twitter;
    LoginFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tab_layout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.ViewPager2);
        fb = findViewById(R.id.facebookLogo);
        google = findViewById(R.id.GoogleLogo);
        twitter = findViewById(R.id.TwitterLogo);


        FragmentManager fm = getSupportFragmentManager();
        adapter = new LoginFragmentAdapter(fm, getLifecycle());
        viewPager2.setAdapter(adapter);

        tab_layout.addTab(tab_layout.newTab().setText("Sign In"));
        tab_layout.addTab(tab_layout.newTab().setText("Sign Up"));

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab_layout.selectTab(tab_layout.getTabAt(position));
            }
        });

    }


}