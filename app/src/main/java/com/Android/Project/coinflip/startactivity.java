package com.Android.Project.coinflip;

import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
/**
 * Created by rickard on 2015-04-08.
 */
public class startactivity extends MainCoinFlip {

    //Aktivitet för att starta

    @Override
    public void onCreate(Bundle savedInstances){
        setContentView(R.layout.startup_screen);
        final Button switchact =(Button)findViewById(R.id.startbutton);
        switchact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent act2 = new Intent(view.getContext(),MainCoinFlip.class);
                startActivity(act2);
            }
        });


    }

}
