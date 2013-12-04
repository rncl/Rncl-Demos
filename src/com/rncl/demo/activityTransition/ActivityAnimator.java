package com.rncl.demo.activityTransition;

import com.rncl.demo.R;

import android.app.Activity;

public class ActivityAnimator {
	public void flipHorizontalAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.flip_horizontal_in,
				R.anim.flip_horizontal_out);
	}

	public void flipVerticalAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.flip_vertical_in,
				R.anim.flip_vertical_out);
	}

	public void fadeAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
	}

	public void disappearTopLeftAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.disappear_top_left_in,
				R.anim.disappear_top_left_out);
	}

	public void appearTopLeftAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.appear_top_left_in,
				R.anim.appear_top_left_out);
	}

	public void disappearBottomRightAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.disappear_bottom_right_in,
				R.anim.disappear_bottom_right_out);
	}

	public void appearBottomRightAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.appear_bottom_right_in,
				R.anim.appear_bottom_right_out);
	}

	public void unzoomAnimation(Activity activity) {
		activity.overridePendingTransition(R.anim.unzoom_in, R.anim.unzoom_out);
	}
}
