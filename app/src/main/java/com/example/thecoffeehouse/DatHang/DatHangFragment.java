package com.example.thecoffeehouse.DatHang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thecoffeehouse.DatHang.Adapter.SectionPagerAdapter;
import com.example.thecoffeehouse.DatHang.Tab.DoAn.DoAnFragment;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.PhoBienFragment;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ThucUongFragment;
import com.example.thecoffeehouse.R;
import com.google.android.material.tabs.TabLayout;

public class DatHangFragment extends Fragment {

    View myFragment_140;
    ViewPager viewPager_140;
    TabLayout tabLayout_140;


    public DatHangFragment() {
        // Required empty public constructor
    }

    public static DatHangFragment getInstance() {
        return new DatHangFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment_140 = inflater.inflate(R.layout.fragment_dat_hang, container, false);
        viewPager_140 = myFragment_140.findViewById(R.id.viewPager);
        tabLayout_140 = myFragment_140.findViewById(R.id.tabLayout);
        return myFragment_140;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager_140);
        tabLayout_140.setupWithViewPager(viewPager_140);
        tabLayout_140.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab_140) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab_140) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab_140) {
            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter_140 = new SectionPagerAdapter(getChildFragmentManager());

        adapter_140.addFragment(new PhoBienFragment(), "Phổ biến");
        adapter_140.addFragment(new ThucUongFragment(), "Thức uống");
        adapter_140.addFragment(new DoAnFragment(), "Đồ ăn");
        viewPager.setAdapter(adapter_140);
    }

}