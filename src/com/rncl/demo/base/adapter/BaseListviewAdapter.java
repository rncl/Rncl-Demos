package com.rncl.demo.base.adapter;

import java.util.List;

import com.rncl.demo.R;
import com.rncl.demo.base.model.ItemDescription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BaseListviewAdapter extends BaseAdapter{

	private List<ItemDescription> list;
	private LayoutInflater inflater;
	
	public BaseListviewAdapter(Context context, List<ItemDescription> list){
		inflater = LayoutInflater.from(context);
		this.list = list;
	}
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
        
		return null;
	}

}
