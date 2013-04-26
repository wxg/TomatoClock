package org.weiko.android.tomato;

import java.util.ArrayList;
import java.util.List;

import org.weiko.android.tomato.page.ActivitiesListPage;
import org.weiko.android.tomato.page.TodaySummaryPage;
import org.weiko.android.tomato.page.TodayTasksPage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<Fragment> pages = new ArrayList<Fragment>();
        pages.add(new TodayTasksPage());
        pages.add(new TodaySummaryPage());
        pages.add(new ActivitiesListPage());
        PageAdapter adapter  = new PageAdapter(getSupportFragmentManager(), pages);
        ViewPager pager = (ViewPager) findViewById(R.id.am_main_view);
        pager.setAdapter(adapter); // this is test
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
