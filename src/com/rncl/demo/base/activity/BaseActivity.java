package com.rncl.demo.base.activity;

import com.rncl.demo.R;
import com.rncl.demo.base.view.ViewHeader;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	private ViewHeader viewHeader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

	}
	
	public void initHeaderTextView(String title){
		viewHeader = (ViewHeader)findViewById(R.id.cloud_header);
		viewHeader.setHeaderText(title);
	}
}
