package org.weiko.android.tomato;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

	private List<Fragment> pages;

	public PageAdapter(FragmentManager fm, List<Fragment> pages) {
		super(fm);
		this.pages = pages;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return pages.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pages.size();
	}

}
