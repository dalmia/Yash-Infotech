package com.project.yashinfotech;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aman on 6/16/2015.
 */
public class Logitech extends DrawerActivity implements View.OnClickListener{

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logitech);
        init();


        btn1.setOnClickListener(this) ;
        btn2.setOnClickListener(this) ;
        btn3.setOnClickListener(this) ;
        btn4.setOnClickListener(this) ;
        btn5.setOnClickListener(this) ;
        btn6.setOnClickListener(this) ;


        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));



    }


    public void init(){
        btn1= (Button) findViewById(R.id.buttonlkeyboard);
        btn2= (Button) findViewById(R.id.buttonlkeyboard2);
        btn3= (Button) findViewById(R.id.buttonlmouse);
        btn4= (Button) findViewById(R.id.buttonlmouse2);
        btn5= (Button) findViewById(R.id.buttonlhead);
        btn6= (Button) findViewById(R.id.buttonlhead2);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.buttonlkeyboard:
                Intent intent = new Intent(Logitech.this, KWired.class);
                startActivity(intent);
                break;
            case R.id.buttonlkeyboard2:
                Intent intent2 = new Intent(Logitech.this, KWireless.class);
                startActivity(intent2);
                break;
            case R.id.buttonlmouse:
                Intent intent3 = new Intent(Logitech.this, MWired.class);
                startActivity(intent3);
                break;
            case R.id.buttonlmouse2:
                Intent intent5 = new Intent(Logitech.this, MWireless.class);
                startActivity(intent5);
                break;
            case R.id.buttonlhead:
                Intent intent4 = new Intent(Logitech.this,  Logitechmodel1.class);
                startActivity(intent4);
                break;
            case R.id.buttonlhead2:
                Intent intent6 = new Intent(Logitech.this, Logitechmodel2.class);
                startActivity(intent6);
                break;
        }

    }
}
