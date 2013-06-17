
package com.giantoctopus.d20;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.giantoctopus.d20.R;

public class Activity_Mystery extends Activity {

	private Button button;
	private TextView main;
	private EditText edit;
	private int sides;
	private float size;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_mystery);
		
		sides = 0;
		
		main = (TextView)findViewById(R.id.textView4);
		main.setTextColor(Color.WHITE);
		
		size = main.getTextSize();
		
		edit = (EditText)findViewById(R.id.editText1);
		
		button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	  String str = (edit.getText()).toString();
		    	  if (!str.matches("[0]+") && str.matches("[0-9]+")) {
			    	  sides = Integer.parseInt(str);
			    	  Random r = new Random();
			    	  int num = r.nextInt(sides)+1;
			    	  main.setText(Integer.toString(num));
				      if (sides > 100) {
				    	  main.setTextSize(60);
				      } else {
				    	  main.setTextSize(size);
				      }
				      if (num == sides) {
				    	  main.setTextColor(Color.GREEN);
				      } else if (num == 1) {
				    	  main.setTextColor(Color.RED);
				      } else {
				    	  main.setTextColor(Color.WHITE);
				      } // end if
		    	  } else {
		    		  main.setText("");
		    	  } // end if
		    } // end method
		}); // end class
		
	} // end method

}