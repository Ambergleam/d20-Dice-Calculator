
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

public class Activity_Roll extends Activity {

	private Button button;
	private TextView main;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_roll);
		main = (TextView)findViewById(R.id.textView4);
		main.setTextColor(Color.WHITE);
		button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		      Random r = new Random();
		      int num = r.nextInt(20)+1;
		      main.setText(Integer.toString(num));
		      if (num == 20) {
		    	  main.setTextColor(Color.GREEN);
		      } else if (num == 1) {
		    	  main.setTextColor(Color.RED);
		      } else {
		    	  main.setTextColor(Color.WHITE);
		      } // end if
		    }
		}); // end class
		
	} // end method

}