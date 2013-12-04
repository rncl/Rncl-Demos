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

public class ProjectDetailsListviewAdapter extends BaseAdapter {

	private ItemDescription item;
	private LayoutInflater inflater;

	public ProjectDetailsListviewAdapter(Context context,
			ItemDescription item) {
		inflater = LayoutInflater.from(context);
		this.item = item;
	}
	
	@Override
	public int getCount() {
		return 4;
	}

	@Override
	public Object getItem(int arg0) {
		return item;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (null == convertView) {
			convertView = inflater.inflate(R.layout.listview_item_main_view,
					null);
		}

		TextView name_textview = (TextView) convertView
				.findViewById(R.id.name_textview);
		TextView description_textview = (TextView) convertView
				.findViewById(R.id.description_textview);

		switch (position) {
		case 0:
			name_textview.setText("项目名称");
			description_textview.setText(item.getName());
			break;
		case 1:
			name_textview.setText("项目说明");
			description_textview.setText(item.getDescription());
			break;
		case 2:
			name_textview.setText("github");
			description_textview.setText(item.getGithubUrl());
			break;
		case 3:
			name_textview.setText("项目截图");
			description_textview.setText("");
			break;
		default:
			break;
		}

		return convertView;
	}

}
