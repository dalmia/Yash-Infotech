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
import android.widget.ViewFlipper;

/**
 * Created by Aman on 6/10/2015.
 */
public class Antivirus extends DrawerActivity {
    Button btn, btn2;

    ViewFlipper flippy;

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antivirus);
        btn2= (Button) findViewById(R.id.anti2);
        btn= (Button) findViewById(R.id.anti1);
        flippy = (ViewFlipper)findViewById(R.id.flipper1);
        flippy.setFlipInterval(2300);
        flippy.startFlipping();


        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable( new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Antivirus.this, Kaspersky.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Antivirus.this, QuickHeal.class);
                startActivity(i);
            }
        });
    }
}
