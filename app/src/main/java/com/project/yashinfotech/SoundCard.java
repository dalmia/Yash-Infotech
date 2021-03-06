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
 * Created by Aman on 6/15/2015.
 */
public class SoundCard extends DrawerActivity {

    Button btn;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundcard);
        btn= (Button) findViewById(R.id.buttonsc1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoundCard.this, SCreative.class);
                startActivity(intent);
            }
        });
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.CYAN));
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }
}
