package com.example.android1_hw7;

import  android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();

    }

    private void initViewPager() {
        viewPager2 = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        viewPagerAdapter= new ViewPagerAdapter(this);
        viewPagerAdapter.addList( createList());
        viewPager2.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(textAdd(tab,position)))).attach();

    }

    private String textAdd(TabLayout.Tab tab, int position) {
        switch (position){
            case 0:
                return "Exchange";
            case 1:
                return "Data & Time";
            case 2:
                return "More";
        }
        return null;
    }

    private ArrayList<Fragment> createList() {
        list = new ArrayList<>();
        ExchangeFragment exchangeFragment = new ExchangeFragment();
        list.add(exchangeFragment);
        list.add(new DataTimeFragment());
        list.add(new MoreFragment());
        return list;
    }

}