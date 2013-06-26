package com.example.testcalendarapp;

import com.example.testcalendarapp.util.Logger;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class GraphActivity_Os extends Activity{
	
	
	/**
	 * Viewクラスを継承して、表示内容をここに追加していきます。
	 * */
	private static class GraphView extends View
	{
//		private DB db = null;
//		private List<Weight> weights = null;
		private float rangeWeight;
		private float rangeTime;
		private float originWeight;
		private float originTime;


		public GraphView(Context context, AttributeSet attrs) {
			super(context, attrs);
		}
	
		public GraphView(Context context) {
			super(context);
			Logger.w(this, "GraphView", "コンストラクタ call");
			setFocusable(true);
//			db = new DB(context);
			getWeights();

		}
		
		/**
		 * データを取得する部分
		 * */
		private void getWeights()
		{
//			weights = db.getAll();
//			int maxWeight = -1;
//			int minWeight = -1;
//			long maxTime = -1;
//			long minTime = -1;
//			Iterator<Weight> i = weights.iterator();
//			while (i.hasNext())
//			{
//				Weight w = i.next();
//				if (maxTime<w.dt.getTime() || maxTime==-1) maxTime = w.dt.getTime();
//				if (minTime>w.dt.getTime() || minTime==-1) minTime = w.dt.getTime();
//			}
//			rangeTime = 2592000000f;//30Days
//			originTime = maxTime - rangeTime;
//			i = weights.iterator();
//			while (i.hasNext())
//			{
//				Weight w = i.next();
//				if (w.dt.getTime() > (long)originTime && w.dt.getTime() < (long)(originTime+rangeTime)) {
//					if (maxWeight<w.weight || maxWeight==-1) maxWeight = w.weight;
//					if (minWeight>w.weight || minWeight==-1) minWeight = w.weight;
//				}
//			}
//			rangeWeight = (float) ((maxWeight - minWeight) * 1.25);
//			if (rangeWeight<1) rangeWeight = 1;
//			if (rangeWeight>1000) rangeWeight = 1000;
//			originWeight = minWeight - rangeWeight/10;
//			if (originWeight<0) originWeight = 0;
	
		}
		
		/**
		 * 描画する部分
		 * */
		@Override
		public void onDraw(Canvas canvas)
		{
			Logger.w(this, "onDraw", "call");
			int ox=10;
			int oy=10;
			float width = this.getWidth() - ox;
			float height = this.getHeight() - oy;
			Paint paint = new Paint();
			paint.setColor(0xFFCCCCCC);
			// 四角を描く
			canvas.drawRect(new Rect(0,0,(int) canvas.getWidth() ,canvas.getHeight() ), paint);
			
//			Iterator<Weight> i = weights.iterator();
//			Weight pw = null;
//			
//			while (i.hasNext())
//			{
//				Weight w = i.next();
//				if (pw != null && w.dt.getTime()>originTime) {
//					paint.setColor(0xFFFF0000);
//					float startX = (pw.dt.getTime()-originTime) / rangeTime * width;
//					float stopX = (w.dt.getTime()-originTime) / rangeTime * width;
//					float startY = height - (pw.weight-originWeight) / rangeWeight * height;
//					float stopY = height - (w.weight-originWeight) / rangeWeight * height;
//					
//					// 線を引く
//					canvas.drawLine(startX, startY, stopX, stopY, paint);
//				}
//				if (w.dt.getTime()>originTime + rangeTime) break;
//				pw = w;
//			}
//			
			for(int n=0; n < 10; ++n) {
				Logger.d(this, "onDraw", "for n: " + n);
				
				paint.setColor(0xFFFF0000);
				float startX = n * 10;
				float stopX = n * 10 + 10;
				float startY = n * 15;
				float stopY = n * 15 + 10;

				// 線を引く
				canvas.drawLine(startX, startY, stopX, stopY, paint);
			}
			
			// グラフの縦横ラインを引く
			paint.setColor(0xFF000000);
			canvas.drawLine(ox, 0, ox, height, paint);
			canvas.drawLine(ox, height, ox+width, height, paint);

			/*
			 * 上記以外にも補助線、項目（単位）といった描画が必要 
			 * また、drawLineなどで座標をしている気がする（n*10　からn*10+10へ線を引いているのに右下がりだったので）
			 * 
			 * 
			 *  */
		}
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(new GraphView(this));
		
	}
	
	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
		super.onPause();
	}
	
	
}