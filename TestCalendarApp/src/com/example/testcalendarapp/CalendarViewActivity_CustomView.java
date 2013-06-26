package com.example.testcalendarapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

import com.example.testcalendar.CalendarView.CalendarRefactView;

public class CalendarViewActivity_CustomView extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calender_custom_view);
		
		CalendarRefactView calendarView = (CalendarRefactView) findViewById(R.id.carendar_refact);   
		calendarView.set(2013, 6-1); // 2013年3月にセット  

	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	public class TestOnClickListener implements OnClickListener{

		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
	}

}
