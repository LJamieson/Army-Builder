package lewisjamieson.com.armybuilder;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";

    private SectionPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"onCreate: Starting.");

        // Create page adapter
        mSectionsPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        // Call setup view pager method
        setupViewPager(mViewPager);
        // create tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabHomeFragment(),"Home");
        adapter.addFragment(new TabHQFragment(), "HQ");
        adapter.addFragment(new TabEliteFragment(), "Elite");
        adapter.addFragment(new TabTroopFragment(), "Troop");
        adapter.addFragment(new TabFastFragment(), "Fast Attack");
        adapter.addFragment(new TabHeavyFragment(), "Heavy Support");
        viewPager.setAdapter(adapter);
    }
}

