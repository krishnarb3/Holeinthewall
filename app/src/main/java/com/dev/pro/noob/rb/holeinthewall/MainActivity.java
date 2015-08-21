package com.dev.pro.noob.rb.holeinthewall;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity
{
    //DrawingTheBall ball;
    MySurface surface;
    ArrayList<View> viewarray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //ball = new DrawingTheBall(this);
        surface = new MySurface(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        surface.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        surface.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
