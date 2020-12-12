package com.example.thecoffeehouse.DatHang.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList_140 = new ArrayList<>();
    private List<String> titleList_140 = new ArrayList<>();

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList_140.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList_140.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList_140.get(position);
    }

    public void addFragment(Fragment fragment, String title)    {
        fragmentList_140.add(fragment);
        titleList_140.add(title);
    }

}
