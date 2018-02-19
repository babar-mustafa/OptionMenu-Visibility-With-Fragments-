package manager.local.com.optionmenu.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;



public class TabAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragmentArrayList;
    private Context context;

    public TabAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList, Context context) {
        super(fm);
        this.fragmentArrayList = fragmentArrayList;
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
//        Fragment Fragmentposition = null;
//        if (position == 0) {
//            Fragmentposition = fragmentArrayList.get(position);
//        } else if (position > 0){
//            Fragmentposition = fragmentArrayList.get(position-1);
//        }
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
