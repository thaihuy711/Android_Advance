package com.thaihuy.tablayout_viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.thaihuy.tablayout_viewpager.Fragment.FragmentOne;
import com.thaihuy.tablayout_viewpager.Fragment.FragmentThree;
import com.thaihuy.tablayout_viewpager.Fragment.FragmentTwo;

/**
 * Created by ThaiHuyPC on 5/7/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FragmentOne();
                break;
            case 1:
                fragment = new FragmentTwo();
                break;
            case 2:
                fragment = new FragmentThree();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "1";
                break;
            case 1:
                title = "2";
                break;
            case 2:
                title = "3";
                break;
        }
        return title;
    }
}
