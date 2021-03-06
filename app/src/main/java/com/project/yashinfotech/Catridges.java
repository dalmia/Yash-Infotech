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
 * Created by Aman on 6/15/2015.
 */
public class Catridges extends DrawerActivity {

    Button btn;
    ViewFlipper flippy;


    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catridges);
        btn= (Button) findViewById(R.id.buttoncat1);
        flippy = (ViewFlipper)findViewById(R.id.flipper2);
        flippy.setFlipInterval(2300);
        flippy.startFlipping();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Catridges.this, Canon.class);
                startActivity(intent);

            }
        });
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }
}
