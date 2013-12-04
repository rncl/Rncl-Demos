package com.rncl.demo.activityTransition;

import com.rncl.demo.R;
import com.rncl.demo.base.activity.BaseActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FirstActivity extends BaseActivity implements OnItemClickListener {

	private ListView listView;
	private ListAdapter adapter;
	private String[] _animationList = { "fade", "flipHorizontal",
			"flipVertical", "disappearTopLeft", "appearTopLeft",
			"appearBottomRight", "disappearBottomRight", "unzoom" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activitytransition_firstactivity);

		initialize();
	}

	private void initialize() {

		initHeaderTextView("Activity切换特效");

		listView = (ListView) findViewById(R.id.activitytransition_listView);
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,  _animationList);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void initHeaderTextView(String title) {
		super.initHeaderTextView(title);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("backAnimation", _animationList[arg2]);
		startActivity(intent);
		
		try {
			ActivityAnimator anim = new ActivityAnimator();
			anim.getClass().getMethod(_animationList[arg2] + "Animation",
							Activity.class).invoke(anim, this);
		} catch (Exception e) {
			Toast.makeText(this, "An error occured " + e.toString(),
					Toast.LENGTH_LONG).show();
		}

	}
}
