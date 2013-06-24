package com.example.testcalendarapp;

import java.util.Calendar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.testcalendar.CalendarView.CalendarView;
import com.example.testcalendarapp.util.Logger;

public class CalendarViewActivityFirst extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calender_first);

		CalendarView cal = (CalendarView) findViewById(R.id.carendar);
		cal.beginningWeek = Calendar.SUNDAY; // 週の開始曜日を指定
		cal.init(2013, 5-1); // 2012年9月のカレンダーを表示 


		ImageView view = (ImageView)findViewById(R.id.image);
		view.setDrawingCacheEnabled(true);
		
//		try {
//			Bitmap bitmap1 = Bitmap.createBitmap(view.getDrawingCache());
//			if(bitmap1 != null) {
//				Logger.i(this, "onCreate", "###");
//			}else {
//				Logger.e(this, "onCreate", "###");
//			}
//		}catch (NullPointerException e) {
//			Logger.e(this, "", "#### ##### ####");
//			return;
//		}
		
		
		View layout = view.getRootView();

		layout.setDrawingCacheEnabled(true);
		Bitmap bitmap = layout.getDrawingCache();

		MediaStore.Images.Media.insertImage(this.getContentResolver(), bitmap, null, null);


	}

	@Override
	protected void onStart() {
		super.onStart();
	}


}
