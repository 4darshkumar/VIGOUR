package com.example.vigour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class diet_plan extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8;
    ViewPager viewPager;
    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);
        getSupportActionBar().hide();

        tabLayout=(TabLayout) findViewById(R.id.tablayout1);
        tb1=(TabItem)findViewById(R.id.tab1);
        tb2=(TabItem)findViewById(R.id.tab2);
        tb3=(TabItem)findViewById(R.id.tab3);
        tb4=(TabItem)findViewById(R.id.tab4);
        tb5=(TabItem)findViewById(R.id.tab5);
        tb6=(TabItem)findViewById(R.id.tab6);
        tb7=(TabItem)findViewById(R.id.tab7);
        tb8=(TabItem)findViewById(R.id.tab8);
        viewPager=(ViewPager)findViewById(R.id.vp);

        pageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 ||tab.getPosition()==4 ||tab.getPosition()==5 ||tab.getPosition()==6 ||tab.getPosition()==7)
                    pageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}