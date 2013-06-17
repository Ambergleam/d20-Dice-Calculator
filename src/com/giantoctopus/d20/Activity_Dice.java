
package com.giantoctopus.d20;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.giantoctopus.d20.R;

public class Activity_Dice extends Activity {

	private Button d3, d4, d6, d8, d10, d12, d20, d100;
	private TextView text;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_dice);
		text = (TextView)findViewById(R.id.textView1);
		text.setTextColor(Color.WHITE);
		
		d3 = (Button)findViewById(R.id.button1);
		d3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(3)+1;
		      shift(num, 3);
		    }
		}); // end d3
		
		d4 = (Button)findViewById(R.id.button2);
		d4.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(4)+1;
		      shift(num, 4);
		    }
		}); // end d4
		
		d6 = (Button)findViewById(R.id.button3);
		d6.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(6)+1;
		      shift(num, 6);
		    }
		}); // end d6
		
		d8 = (Button)findViewById(R.id.button4);
		d8.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(8)+1;
		      shift(num, 8);
		    }
		}); // end d8
		
		d10 = (Button)findViewById(R.id.button5);
		d10.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(10)+1;
		      shift(num, 10);
		    }
		}); // end d10
		
		d12 = (Button)findViewById(R.id.button6);
		d12.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(12)+1;
		      shift(num, 12);
		    }
		}); // end d12
		
		d20 = (Button)findViewById(R.id.button7);
		d20.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(20)+1;
		      shift(num, 20);
		    }
		}); // end d20
		
		d100 = (Button)findViewById(R.id.button8);
		d100.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(100)+1;
	      	  shift(num, 100);
		    }
		}); // end d100
		
	} // end method
	
	public void shift(int num, int max) {
	    text.setText(Integer.toString(num));
    	  if (num == max) {
	    	  text.setTextColor(Color.GREEN);
	      } else if (num == 1) {
	    	  text.setTextColor(Color.RED);
	      } else {
	    	  text.setTextColor(Color.WHITE);
	      } // end if
	}

}
