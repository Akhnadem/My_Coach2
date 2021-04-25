package com.example.my_coach.sport.MentalSports.Sudoku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.my_coach.R;
import com.example.my_coach.sport.MentalSports.Chess.SectionPagerAdapter7;
import com.google.android.material.tabs.TabLayout;

public class Sudoku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.pager);

        viewPager.setAdapter(new SectionPagerAdapter8(getSupportFragmentManager(), 0));
        tabLayout.setupWithViewPager(viewPager);
    }
}