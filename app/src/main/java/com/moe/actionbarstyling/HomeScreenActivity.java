package com.moe.actionbarstyling;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class HomeScreenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getActionBar().setDisplayHomeAsUpEnabled(false);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT)
                    .show();break;
              case R.id.action_settings1:
                  Toast.makeText(this, "2", Toast.LENGTH_SHORT)
                      .show();break;
            case R.id.action_settings2:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT)
                    .show(); break;
            default:break; }return super.onOptionsItemSelected(item);

    }
}
