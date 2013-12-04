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

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activitytransition_secondactivity);

		initialize();
	}

	private void initialize() {

		initHeaderTextView(this.getIntent().getExtras()
									.getString("backAnimation"));

	}

	@Override
	public void initHeaderTextView(String title) {
		super.initHeaderTextView(title);
	}

	@Override
	public void onBackPressed() {
		back(null);
	}

	public void back(View v) {
		this.finish();
		try {
			ActivityAnimator anim = new ActivityAnimator();
			anim.getClass().getMethod(this.getIntent().getExtras()
									.getString("backAnimation") + "Animation", Activity.class)
										.invoke(anim, this);
		} catch (Exception e) {
			Toast.makeText(this, "An error occured " + e.toString(),
					Toast.LENGTH_LONG).show();
		}
	}


}
