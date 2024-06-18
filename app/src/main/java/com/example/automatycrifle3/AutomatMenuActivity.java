package com.example.automatycrifle3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class AutomatMenuActivity extends AppCompatActivity {


    int position = 0;

    Toolbar toolbar;

    private int[] array_automaty_name= {R.string.akm_name,
            R.string.akms_name,
            R.string.ak74_name,
            R.string.ak74m_name,
            R.string.aks74_name,
            R.string.aks74u_name,
            R.string.ak12_name,
            R.string.ak15_name,
            R.string.ak101_name,
            R.string.ak102_name,
            R.string.ak103_name,
            R.string.ak104_name,
            R.string.ak105_name};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automat_menu);
        toolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);


        //кнопка назад
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //связывание с прокруткой
        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

        //Связывание с TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

        reciveIntent();

    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter{

        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public int getCount(){
            return 5;
        }

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0:
                    return new NaznachenieFragment();
                case 1:
                    return new UstroystvoFragment();
                case 2:
                    return new RazborkaFragment();
                case 3:
                    return new TtxFragment();
                case 4:
                    return new PristrFragment();
            }
            return null;

        }

        @Override
        public CharSequence getPageTitle(int position){
            switch (position) {
                case 0:
                    return getResources().getText(R.string.menu_nazn);
                case 1:
                    return getResources().getText(R.string.menu_ustr);
                case 2:
                    return getResources().getText(R.string.menu_razb);
                case 3:
                    return getResources().getText(R.string.menu_ttx);
                case 4:
                    return getResources().getText(R.string.menu_pristr);
            }

            return null;
        }

    }

    private void reciveIntent() {
        Intent i = getIntent();
        if (i != null) {
            position = i.getIntExtra("position", 0);
            toolbar.setTitle(array_automaty_name[position]);
            setSupportActionBar(toolbar);
        }

    }

}

