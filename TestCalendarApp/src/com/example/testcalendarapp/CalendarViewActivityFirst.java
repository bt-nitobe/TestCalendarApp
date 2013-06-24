package com.example.testcalendarapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.example.testcalendar.CalendarView.CalendarView;
import com.example.testcalendarapp.util.Logger;

public class CalendarViewActivityFirst extends Activity{
	
	protected ImageView _view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Logger.i(this, "onCreate", "call CalendarViewActivityFirst");

		
		setContentView(R.layout.activity_calender_first);

		CalendarView cal = (CalendarView) findViewById(R.id.carendar);
		cal.beginningWeek = Calendar.SUNDAY; // 週の開始曜日を指定
		cal.init(2013, 5-1); // 2012年9月のカレンダーを表示 

		_view = (ImageView)findViewById(R.id.image);
		_view.setOnClickListener(new TestSample());

		
		/**
		 * onCreateでキャプチャまで実行するとエラーが発生する。（NullPointer）
		 * そこで、キャプチャ契機をImageView押下に変更してみる
		 * */
	}

	
	public void saveFile(View view){
		Logger.d(this, "saveFile", "call");
		
		// キャプチャ
		try {
			FileOutputStream out = openFileOutput("TestFile.png", MODE_PRIVATE);

			_view.setDrawingCacheEnabled(false);		
			_view.setDrawingCacheEnabled(true);		

			Bitmap bitmap0 = Bitmap.createBitmap(_view.getDrawingCache() );
			bitmap0.compress(CompressFormat.PNG, 100, out);
            out.close();

		} catch (FileNotFoundException e) {
			Logger.e(this, "saveFile", "FileNotFoundException : " +e);
		} catch (NullPointerException e) {
			Logger.e(this, "saveFile", "NullPointerException : " +e);
		} catch (IOException e) {
			Logger.e(this, "saveFile", "IOException : " +e);
		} 
	}
	
	
	
	public class TestSample implements OnClickListener{

		@Override
		public void onClick(View v) {
			
			Logger.e(this, "onClick", "ImageViewがClickされました");
			saveFile(v);
		}
	}
}