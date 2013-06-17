package com.giantoctopus.d20;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.giantoctopus.d20.R;

public class Activity_Damage extends Activity {

	private Button clear, roll, plusd3, plusd4, plusd6, plusd8, plusd10, plusd12, plusd20, plusd100, minusd3, minusd4, minusd6, minusd8, minusd10, minusd12, minusd20, minusd100;
	private TextView result;
	private EditText editd3, editd4, editd6, editd8, editd10, editd12, editd20, editd100, pluses;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_damage);
		
		result = (TextView)findViewById(R.id.result);
		
		editd3 = (EditText)findViewById(R.id.editd3);
		editd4 = (EditText)findViewById(R.id.editd4);
		editd6 = (EditText)findViewById(R.id.editd6);
		editd8 = (EditText)findViewById(R.id.editd8);
		editd10 = (EditText)findViewById(R.id.editd10);
		editd12 = (EditText)findViewById(R.id.editd12);
		editd20 = (EditText)findViewById(R.id.editd20);
		editd100 = (EditText)findViewById(R.id.editd100);
		pluses = (EditText)findViewById(R.id.pluses);
		
		clear = (Button)findViewById(R.id.clear);
		clear.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	clear();
		    }
		}); // end inner class
		
		roll = (Button)findViewById(R.id.roll);
		roll.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	roll();
		    }
		}); // end inner class
		
		plusd3 = (Button)findViewById(R.id.plusd3);
		plusd3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd3);
		    }
		}); // end inner class
		
		plusd4 = (Button)findViewById(R.id.plusd4);
		plusd4.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd4);
		    }
		}); // end inner class
		
		plusd6 = (Button)findViewById(R.id.plusd6);
		plusd6.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd6);
		    }
		}); // end inner class
		
		plusd8 = (Button)findViewById(R.id.plusd8);
		plusd8.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd8);
		    }
		}); // end inner class
		
		plusd10 = (Button)findViewById(R.id.plusd10);
		plusd10.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd10);
		    }
		}); // end inner class
		
		plusd12 = (Button)findViewById(R.id.plusd12);
		plusd12.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd12);
		    }
		}); // end inner class
		
		plusd20 = (Button)findViewById(R.id.plusd20);
		plusd20.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd20);
		    }
		}); // end inner class
		
		plusd100 = (Button)findViewById(R.id.plusd100);
		plusd100.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	plus(editd100);
		    }
		}); // end inner class
		
		minusd3 = (Button)findViewById(R.id.minusd3);
		minusd3.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd3);
		    }
		}); // end inner class
		
		minusd4 = (Button)findViewById(R.id.minusd4);
		minusd4.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd4);
		    }
		}); // end inner class
		
		minusd6 = (Button)findViewById(R.id.minusd6);
		minusd6.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd6);
		    }
		}); // end inner class
		
		minusd8 = (Button)findViewById(R.id.minusd8);
		minusd8.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd8);
		    }
		}); // end inner class
		
		minusd10 = (Button)findViewById(R.id.minusd10);
		minusd10.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd10);
		    }
		}); // end inner class
		
		minusd12 = (Button)findViewById(R.id.minusd12);
		minusd12.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd12);
		    }
		}); // end inner class
		
		minusd20 = (Button)findViewById(R.id.minusd20);
		minusd20.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd20);
		    }
		}); // end inner class
		
		minusd100 = (Button)findViewById(R.id.minusd100);
		minusd100.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	minus(editd100);
		    }
		}); // end inner class
		
	} // end method
	
	public void plus(EditText txt) {
		if (txt.getText().toString().equals("")) {
    		txt.setText("1");
    	} else {
    		int num = Integer.parseInt(txt.getText().toString());
    		num++;
    		txt.setText(Integer.toString(num));
    	} // end if
	} // end method
	
	public void minus(EditText txt) {
		if (!txt.getText().toString().matches("[0]+") && !txt.getText().toString().equals("")) {
    		int num = Integer.parseInt(txt.getText().toString());
    		num--;
    		txt.setText(Integer.toString(num));
    	} else {
    		txt.setText("0");
    	} // end if
	} // end method
	
	public void clear() {
		editd3.setText("");
		editd4.setText("");
		editd6.setText("");
		editd8.setText("");
		editd10.setText("");
		editd12.setText("");
		editd20.setText("");
		editd100.setText("");
		pluses.setText("");
		result.setText("");
	} // end method
	
	public void roll() {
		int total = 0;
		total += gen(editd3, 3);
		total += gen(editd4, 4);
		total += gen(editd6, 6);
		total += gen(editd8, 8);
		total += gen(editd10, 10);
		total += gen(editd12, 12);
		total += gen(editd20, 20);
		total += gen(editd100, 100);
		if (!pluses.getText().toString().equals("")) total += Integer.parseInt(pluses.getText().toString());
		result.setText(Integer.toString(total));
	} // end method
	
	public int gen(EditText txt, int sides) {
		Random r = new Random();
		int total = 0;
		String str = txt.getText().toString();
		if (!str.matches("[0]+") && str.matches("[0-9]+")) {
			int rolls = Integer.parseInt(str);
			for (int i = 0; i < rolls; i++) {
				total += r.nextInt(sides)+1;
			} // end for
		} else {
			txt.setText("");
		} // end if
		return(total);
	} // end method

} // end class
