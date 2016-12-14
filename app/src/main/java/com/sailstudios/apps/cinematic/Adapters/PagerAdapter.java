package com.sailstudios.apps.cinematic.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sailstudios.apps.cinematic.fragments.FavFragment;
import com.sailstudios.apps.cinematic.fragments.PopularFragment;
import com.sailstudios.apps.cinematic.fragments.TopRatedFragment;

/**
 * Created by Pavan on 14-12-2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;
    private static final String[] PAGE_TITLES = {"POPULAR", "TOP RATED", ""};

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new PopularFragment();
            case 1:
                return new TopRatedFragment();
            case 2:
                return new FavFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position < PAGE_TITLES.length)
            return PAGE_TITLES[position];
        else return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
