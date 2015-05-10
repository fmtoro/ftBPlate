package com.ftpha.recycler1;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView.*;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import Data.Peeps;  // my own class to hold people


public class MainActivity extends ActionBarActivity {
    private RecyclerView ftRV;
    private Adapter ftRVA;
    private StaggeredGridLayoutManager ftRVLM;
    private List<Peeps> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = popData();

        ftRV = (RecyclerView) findViewById(R.id.myFrstRecycler); //OJO

        ftRV.setHasFixedSize(false);

        //Get orientation is defined later, then on landscape i use  2 cols
        ftRVLM = new StaggeredGridLayoutManager(getScreenOrientation(),1);
        ftRVLM.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);

        ftRV.setLayoutManager(ftRVLM);

        ftRVA = new ftAdapter(this, data);
        ftRV.setAdapter(ftRVA);
    }

    private List<Peeps> popData() {

        List<Peeps> iData = new ArrayList<>();

        Peeps peeps = new Peeps();
        peeps.ftImg = R.drawable.superman;
        peeps.ftName = "Superman\n (the greatest superhero known to man)";
        peeps.ftPhone = "(555) 555-5552";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.9;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.pope;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.batman;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.hsh1;
        peeps.ftName = "Pietra Liguma";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pietra@jmu.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.hsh2;
        peeps.ftName = "Kathy Rusia";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.hsh3;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.hsh4;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.hsh5;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h1;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h2;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h3;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h4;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h5;
        peeps.ftName = "Batman";
        peeps.ftPhone = "(555) 555-5551";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.1;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h6;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        peeps = new Peeps();
        peeps.ftImg = R.drawable.h7;
        peeps.ftName = "The Pope";
        peeps.ftPhone = "(555) 555-5555";
        peeps.ftEmail = "pope@VC.com";
        peeps.ftRating = (float)4.67;
        iData.add(peeps);

        return iData;
    }
    public int getScreenOrientation()
    {
        Display getOrient = getWindowManager().getDefaultDisplay();
        int orientation = 0;//Undefined
        if(getOrient.getWidth()==getOrient.getHeight()){
            orientation = 1; // square
        } else{
            if(getOrient.getWidth() < getOrient.getHeight()){
                orientation = 1;//portrait
            }else {
                orientation = 2;//landscape
            }
        }
        return orientation;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


