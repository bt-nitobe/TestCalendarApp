package com.example.testcalendarapp;

import android.app.Activity;
import android.content.Intent;
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
			intent = new Intent(this, CalendarViewActivityFirst.class );
			
		}else if(view.getId() == R.id.button2){
			intent = new Intent(this, CalendarViewActivitySecond.class );
			
		}else if(view.getId() == R.id.button3){
			intent = new Intent(this, CalendarViewActivityThird.class );
			
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
		
		Button btnB = (Button)findViewById(R.id.button2);
		btnB.setOnClickListener(this);
		
		Button btnC = (Button)findViewById(R.id.button3);
		btnC.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
