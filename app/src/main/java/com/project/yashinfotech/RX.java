package com.project.yashinfotech;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

/**
 * Created by Aman on 6/15/2015.
 */
public class RX extends DrawerActivity {
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rx);
        getActionBar().setTitle(" ");
        getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }
}
