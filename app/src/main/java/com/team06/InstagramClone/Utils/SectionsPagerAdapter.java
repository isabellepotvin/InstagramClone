package com.team06.InstagramClone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isabellepotvin on 2018-02-22.
 */

/**
 * Class that stores fragments for tabs
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter{

    private static final String TAG = "SectionsPagerAdapter";

    private final List<Fragment> mFragmentList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    //returns a fragment at a specific position
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    //returns the list size
    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    //method that adds fragments to the list
    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
