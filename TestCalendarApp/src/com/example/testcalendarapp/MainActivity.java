package com.example.testcalendarapp;

import java.util.Calendar;

import com.example.testcalendar.CalendarView.CalendarView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        CalendarView cal = (CalendarView) findViewById(R.id.carendar);
        cal.beginningWeek = Calendar.SUNDAY; // 週の開始曜日を指定
        cal.init(2012, 9-1); // 2012年9月のカレンダーを表示        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
