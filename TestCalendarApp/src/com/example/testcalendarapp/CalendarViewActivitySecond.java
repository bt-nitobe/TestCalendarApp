package com.example.testcalendarapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.testcalendar.CalendarView.CalendarRefactView;

public class CalendarViewActivitySecond extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calender_second);
		
		CalendarRefactView calendarView = (CalendarRefactView) findViewById(R.id.carendar_refact);   
		calendarView.set(2013, 6-1); // 2013年3月にセット  

	}

	@Override
	protected void onStart() {
		super.onStart();
	}


}
