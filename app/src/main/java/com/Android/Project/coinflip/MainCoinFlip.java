package com.Android.Project.coinflip;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainCoinFlip extends ActionBarActivity
{

LinearLayout myLO;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coin_flip);
        myLO = (LinearLayout) findViewById(R.id.MainCoinLayout);
        RandomNumberGenerator number = new RandomNumberGenerator();
        int Ran_Number = number.randInt();
        final ImageButton Coin = (ImageButton) findViewById(R.id.Coin);
        Coin.setBackgroundResource(R.drawable.gold_coin);





    }
    public void buttonOnClick(View v)
    {
        Button Coin =(Button) v;
        ((Button) v).setBackgroundResource(R.drawable.plain_gold_coin);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_coin_flip, menu);
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
