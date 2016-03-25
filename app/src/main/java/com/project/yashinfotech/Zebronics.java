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
public class Zebronics extends DrawerActivity {

    Button btn1, btn2;

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zebronics);
        btn1= (Button) findViewById(R.id.buttonzlan1);
        btn2= (Button) findViewById(R.id.buttonzmoth1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zebronics.this, LZebro.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Zebronics.this, MZeb.class);
                startActivity(intent);
            }
        });

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }
}
