package com.example.vigour;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 : return new main();
            case 1 : return new d1();
            case 2 : return new d2();
            case 3 : return new d3();
            case 4 : return new d4();
            case 5 : return new d5();
            case 6 : return new d6();
            case 7 : return new d7();
            default: return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
