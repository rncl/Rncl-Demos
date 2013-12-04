package com.rncl.demo.base.view;

import com.rncl.demo.R;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 标题栏 头部 通用
 * 
 * @author Administrator
 * 
 */
public class ViewHeader extends RelativeLayout {

	private TextView headerTextView;
	private Button headerBackButton;
	private Button headerOptionButton;

	public ViewHeader(Context context) {
		super(context);
		initialize();
	}

	public ViewHeader(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize();
	}

	// 初始化控件
	private void initialize(){
		
		((LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
			.inflate(R.layout.view_header, this, true);
		
		headerTextView = (TextView)findViewById(R.id.header_textview);
		
		// 使用自定义字体
		Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/YEGENYOUTEKAI9-28_0.TTF");
		headerTextView.setTypeface(typeface);
		
		
		headerBackButton = (Button)findViewById(R.id.header_back_button);
		headerOptionButton = (Button)findViewById(R.id.header_option_button);
	}

	public void setHeaderText(CharSequence titleText) {
		headerTextView.setText(titleText);
	}

}
