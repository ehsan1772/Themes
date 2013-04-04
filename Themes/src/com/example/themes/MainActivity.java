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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Boolean test = null;
        try{
        test = getIntent().getExtras().getBoolean("Set_Dark");
        } catch (Exception e){}
        if (test == null)
        {
		setTheme(R.style.LightTheme);
		theme = R.style.LightTheme;
        } else {
        	if(test){
        		setTheme(R.style.DarkTheme);
        		theme =R.style.DarkTheme;
        	} else {
        		setTheme(R.style.LightTheme);
        		theme =R.style.LightTheme;
        	}
        }
        setContentView(R.layout.activity_main);

        
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
