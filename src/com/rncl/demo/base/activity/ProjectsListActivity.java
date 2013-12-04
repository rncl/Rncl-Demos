package com.rncl.demo.base.activity;

import java.util.ArrayList;
import java.util.List;

import com.rncl.demo.R;
import com.rncl.demo.R.array;
import com.rncl.demo.R.id;
import com.rncl.demo.R.layout;
import com.rncl.demo.base.adapter.ProjectsListListviewAdapter;
import com.rncl.demo.base.model.ItemDescription;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ProjectsListActivity extends BaseActivity {
	
	private ListView listView;
	private ProjectsListListviewAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initialize();
	}
	
	private void initialize() {
		
		initHeaderTextView("项目列表");
		
		String[] names = getResources().getStringArray(R.array.name);
		String[] descriptions = getResources().getStringArray(R.array.description);
		
		List<ItemDescription> list = new ArrayList<ItemDescription>();
		for(int i = 0; i < names.length; i++){
			ItemDescription item = new ItemDescription();
			item.setName(names[i]);
			item.setDescription(descriptions[i]);
			list.add(item);
		}
		
		listView = (ListView)findViewById(R.id.listview);
		adapter = new ProjectsListListviewAdapter(this, list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				Intent intent = new Intent(ProjectsListActivity.this, ProjectDetailsActivity.class);
				intent.putExtra("index", (int)arg3);
				startActivity(intent);
//				overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
			}
			
		});
	}

	@Override
	public void initHeaderTextView(String title) {
		super.initHeaderTextView(title);
	}

	

}
