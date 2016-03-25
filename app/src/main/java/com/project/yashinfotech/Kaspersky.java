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
public class Kaspersky extends DrawerActivity {

    Button btn, btn1, btn2, btn3;
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaspersky);
        btn= (Button) findViewById(R.id.kasp1);
        btn1= (Button) findViewById(R.id.kasp2);
        btn2= (Button) findViewById(R.id.kasp3);
        btn3= (Button) findViewById(R.id.kasp4);
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable( new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Kaspersky.this, KAnti.class);
                startActivity(intent1);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Kaspersky.this, KInter.class);
                startActivity(intent2);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Kaspersky.this, KPure.class);
                startActivity(intent3);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Kaspersky.this, KServer.class);
                startActivity(intent4);
            }
        });


    }
}
