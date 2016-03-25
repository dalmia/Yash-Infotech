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
 * Created by Aman on 6/10/2015.
 */
public class QuickHeal extends DrawerActivity {

    Button btn, btn1, btn2, btn3, btn4;
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quickheal);
        btn= (Button) findViewById(R.id.quick1);
        btn1= (Button) findViewById(R.id.quick2);
        btn4= (Button) findViewById(R.id.quick5);
        btn2= (Button) findViewById(R.id.quick3);
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuickHeal.this, QServer.class);
                startActivity(intent);
            }
        });
        btn3= (Button) findViewById(R.id.quick4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(QuickHeal.this, QAnti.class);
                startActivity(intent1);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(QuickHeal.this, QInter.class);
                startActivity(intent2);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(QuickHeal.this, Qtot.class);
                startActivity(intent3);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(QuickHeal.this, Upgrades.class);
                startActivity(intent4);
            }
        });


    }
}
