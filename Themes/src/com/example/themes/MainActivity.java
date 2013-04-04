package com.example.themes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private boolean setDark;
	private int theme; 
	private Bundle extra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        extra = getIntent().getExtras();
        
        theme = getMyTheme(extra);
        setTheme(theme);
        setContentView(R.layout.activity_main);

        
    }

    private int getMyTheme(Bundle extra){
    	
    	if (extra == null)
    		return openTheme();
  
    	
    	setDark = extra.getBoolean("Set_Dark");
    	
        	if(setDark){
        		return R.style.DarkTheme;
        	} else {
        		return R.style.LightTheme;
        	}
        
    	
    }
    
    private void saveTheme(){
    	int theme;
    	if(setDark)
    		theme =  R.style.DarkTheme;
    	else
    		theme = R.style.LightTheme;
    	
    	this.getSharedPreferences("TheTheme", Activity.MODE_PRIVATE).edit().putInt("Theme", theme).commit();
    }
    
    private int openTheme(){
    	return this.getSharedPreferences("TheTheme", Activity.MODE_PRIVATE).getInt("Theme", R.style.LightTheme);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        getMenuInflater().inflate(R.menu.toggle, menu);
        return true;
    }


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (theme == R.style.DarkTheme)
			setDark = false;
		else
			setDark = true;
		saveTheme();
		Intent intent = getIntent();
		intent.putExtra("Set_Dark", setDark);
		finish();
		startActivity(intent);
		return super.onOptionsItemSelected(item);
	}


	@Override
	protected void onSaveInstanceState(Bundle outState) {
		outState.putBoolean("Set_Dark", setDark);
		super.onSaveInstanceState(outState);
	}
    
	
    
}
