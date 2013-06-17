
package com.giantoctopus.d20;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import com.giantoctopus.d20.R;

public class Main extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources();
		TabHost tabHost = getTabHost();

		Intent intent = new Intent(this, Activity_Roll.class);
		tabHost.addTab(tabHost.newTabSpec("d20")
				.setIndicator("d20", res.getDrawable(R.drawable.tab_d20))
				.setContent(intent));

		Intent intent2 = new Intent(this, Activity_Dice.class);
		tabHost.addTab(tabHost
				.newTabSpec("Dice")
				.setIndicator("Dice", res.getDrawable(R.drawable.tab_dice))
				.setContent(intent2));
		
		Intent intent3 = new Intent(this, Activity_Damage.class);
		tabHost.addTab(tabHost
				.newTabSpec("Damage")
				.setIndicator("Damage", res.getDrawable(R.drawable.tab_damage))
				.setContent(intent3));
		
		Intent intent4 = new Intent(this, Activity_Mystery.class);
		tabHost.addTab(tabHost
				.newTabSpec("d?")
				.setIndicator("d?", res.getDrawable(R.drawable.tab_mystery))
				.setContent(intent4));
		
		tabHost.setCurrentTab(0);

		tabHost.setBackgroundColor(Color.BLACK);
		tabHost.getTabWidget().setBackgroundColor(Color.BLACK);

	}
}