package com.Android.Project.coinflip;

/**
 * Created by rickard on 2015-04-09.
 *
 *
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.media.MediaPlayer;

public class switcher extends ActionBarActivity{

    @Override

    public void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        setContentView(R.layout.switcher);

        Button switchbutton = (Button)findViewById(R.id.button2);

        switchbutton.setOnClickListener(new View.OnClickListener(){


            @Override
        public void onClick(View view){
                Intent intent = new Intent(switcher.this, MainCoinFlip.class);
                startActivity(intent);
            }

        });

    }


}
