package com.demo.svslide.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.svslide.R;

import java.util.List;

/**
 * Created by KyoWang on 2016/06/03 .
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<String> mData;

    public ViewPagerAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_viewpager_item, container, false);
        ((TextView)view.findViewById(R.id.viewpager_item_tv)).setText(this.mData.get(position));
        container.addView(view);
        return view;
    }
}
