package com.Android.Project.coinflip;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.media.MediaPlayer;



public class MainCoinFlip extends ActionBarActivity
{

LinearLayout myLO;
final RandomNumberGenerator number = new RandomNumberGenerator();
int Ran_Number = number.randInt(); //random coin chance

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coin_flip);
        myLO = (LinearLayout) findViewById(R.id.MainCoinLayout);
        final ImageButton Coin = (ImageButton) findViewById(R.id.Coin); //create coin as an ImageButton
        Coin.setBackgroundResource(R.drawable.gold_coin); //coin is there when you start
    }

    public void buttonOnClick(View Coin) //what happens when you click the ImageButton
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.coin_drop_sound); //create media player that plays coin_drop_sound
        mediaPlayer.start(); //play media player
        Ran_Number = number.randInt(); //generate random number when you click for which side of the coin is should show
        {
            if (Ran_Number == 1) //if the random number is 1
            {
                Coin.setBackgroundResource(R.drawable.plain_gold_coin); //display the plain coin

            }
            if (Ran_Number == 2) //if the random number is 2
            {
                Coin.setBackgroundResource(R.drawable.gold_coin); //display the clover coin
            }
        }

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
