package manager.local.com.optionmenu;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import manager.local.com.optionmenu.Adapter.TabAdapter;
import manager.local.com.optionmenu.Fragment.A;
import manager.local.com.optionmenu.Fragment.B;
import manager.local.com.optionmenu.Fragment.C;

public class MainActivity extends AppCompatActivity {
    A first;
    B second;
    C Third;
    ArrayList<Fragment> fragmentArrayList;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        AddFragemntTOArrayList();
        setUpTabLAyoutViewPager();

    }

    private void setUpTabLAyoutViewPager() {
        tabLayout.addTab(tabLayout.newTab().setText("Fragment A"));
        tabLayout.addTab(tabLayout.newTab().setText("Fragment B"));
        tabLayout.addTab(tabLayout.newTab().setText("Fragment C"));
        tabAdapter = new TabAdapter(getSupportFragmentManager(),fragmentArrayList,MainActivity.this);
        viewPager.setAdapter(tabAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
                        new A();
                        break;
                    case 1:
                        new B();
                        break;
                    case 2:
                        new C();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    private void AddFragemntTOArrayList() {
        fragmentArrayList.add(first);
        fragmentArrayList.add(second);
        fragmentArrayList.add(Third);
    }

    private void initViews() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        first = new A();
        second = new B();
        Third = new C();
        fragmentArrayList= new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addNotes) {
            //do code here
        }
        return super.onOptionsItemSelected(item);
    }
}
