package com.demo.svslide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.demo.svslide.R;

import java.util.List;

/**
 * Created by KyoWang on 2016/06/03 .
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mData;

    public ListViewAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Override
    public int getCount() {
        return this.mData == null ? 0 : this.mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.view_list_item, parent, false);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.list_item_tv);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.bindData(mData.get(position));
        return convertView;
    }

    private static class ViewHolder {
        public TextView tv;

        public void bindData(String str) {
            tv.setText(str);
        }
    }
}
