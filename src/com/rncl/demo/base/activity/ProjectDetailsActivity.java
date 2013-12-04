package com.rncl.demo.base.activity;

import java.util.ArrayList;
import java.util.List;

import com.rncl.demo.R;
import com.rncl.demo.R.array;
import com.rncl.demo.R.id;
import com.rncl.demo.R.layout;
import com.rncl.demo.base.adapter.ProjectDetailsListviewAdapter;
import com.rncl.demo.base.adapter.ProjectsListListviewAdapter;
import com.rncl.demo.base.model.ItemDescription;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class ProjectDetailsActivity extends BaseActivity {
	
	private ListView listView;
	private ProjectDetailsListviewAdapter adapter;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initialize();
	}
	
	private void initialize() {
		
		initHeaderTextView("项目简介");
		
		String[] names = getResources().getStringArray(R.array.name);
		String[] descriptions = getResources().getStringArray(R.array.description);
		
		Intent intent = getIntent();
		int index = -1;
		if(intent != null){
			index = intent.getIntExtra("index", 0);
		}

		ItemDescription item = new ItemDescription();
		item.setName(names[index]);
		item.setDescription(descriptions[index]);

		
		listView = (ListView)findViewById(R.id.listview);
		adapter = new ProjectDetailsListviewAdapter(this, item);
		listView.setAdapter(adapter);

		button = (Button)findViewById(R.id.button);
		button.setVisibility(View.VISIBLE);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String classname = "com.rncl.demo.activityTransition.FirstActivity";
				try {
					Class intentClass = Class.forName(classname);
					Intent intent = new Intent(ProjectDetailsActivity.this, intentClass);
					startActivity(intent);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	@Override
	public void initHeaderTextView(String title) {
		super.initHeaderTextView(title);
	}

	

}
