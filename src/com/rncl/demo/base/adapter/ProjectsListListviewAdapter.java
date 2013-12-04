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

public class ProjectsListListviewAdapter extends BaseListviewAdapter{

	private List<ItemDescription> list;
	private LayoutInflater inflater;
	
	public ProjectsListListviewAdapter(Context context, List<ItemDescription> list){
		super(context, list);
		inflater = LayoutInflater.from(context);
		this.list = list;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

        final ItemDescription item = list.get(position);
        
        if(null == convertView)
        {
            convertView = inflater.inflate(R.layout.listview_item_main_view, null);
        }
		
        TextView name_textview = (TextView)convertView.findViewById(R.id.name_textview);
        name_textview.setText(item.getName());
        
        TextView description_textview = (TextView)convertView.findViewById(R.id.description_textview);
        description_textview.setText(item.getDescription());
        
		return convertView;
	}

}
