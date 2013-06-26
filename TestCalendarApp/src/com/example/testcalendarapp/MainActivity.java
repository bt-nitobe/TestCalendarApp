package com.example.testcalendarapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.testcalendarapp.util.Logger;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	public void onClick(View view) {
		Intent intent = null;
		
		if(view.getId() == R.id.button1) {
			intent = new Intent(this, CalendarViewActivity_Captcha.class );
			
		}else if(view.getId() == R.id.button2){
			intent = new Intent(this, CalendarViewActivity_CustomView.class );
			
		}else if(view.getId() == R.id.button3){
			intent = new Intent(this, CalendarViewActivity_Os_Calendar.class );
			
		}else if(view.getId() == R.id.button4){
			intent = new Intent(this, GraphActivity_AFreeChart.class );
			
		}else if(view.getId() == R.id.button5){
			intent = new Intent(this, GraphActivity_AChartEngin.class );
			
		}else if(view.getId() == R.id.button6){
			intent = new Intent(this, GraphActivity_Os.class );
			
		}else {
			
		}
		
		if(intent != null) {
			startActivity(intent);
		}

	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Logger.startLogger(this, "TEST");
		Logger.d(this, "onCreate", "call");

		Button btnA = (Button)findViewById(R.id.button1);
		btnA.setOnClickListener(this);
		btnA.setEnabled(true);
		
		Button btnB = (Button)findViewById(R.id.button2);
		btnB.setOnClickListener(this);
		btnB.setEnabled(true);
		
		Button btnC = (Button)findViewById(R.id.button3);
		btnC.setOnClickListener(this);
		btnC.setEnabled(false);
		
		Button btnD = (Button)findViewById(R.id.button4);
		btnD.setOnClickListener(this);
		btnD.setEnabled(true);
		
		Button btnE = (Button)findViewById(R.id.button5);
		btnE.setOnClickListener(this);
		btnE.setEnabled(true);
		
		Button btnF = (Button)findViewById(R.id.button6);
		btnF.setOnClickListener(this);
		btnF.setEnabled(true);
		
		checkBuildVersion(btnC.getId());
	}

	
	@TargetApi(4)
	protected void checkBuildVersion(int view) {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			Button  btn = (Button)findViewById(view);
			btn.setEnabled(true);
		}

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
