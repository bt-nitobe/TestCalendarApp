package com.example.testcalendarapp;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;

import com.example.testcalendar.CalendarView.CalendarView;

public class CalendarViewActivityFirst extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calender_first);

		CalendarView cal = (CalendarView) findViewById(R.id.carendar);
		cal.beginningWeek = Calendar.SUNDAY; // 週の開始曜日を指定
		cal.init(2013, 5-1); // 2012年9月のカレンダーを表示 


	}

	@Override
	protected void onStart() {
		super.onStart();
	}


}
