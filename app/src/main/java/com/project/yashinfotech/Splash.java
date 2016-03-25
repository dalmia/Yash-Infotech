package com.project.yashinfotech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

    @Override
    public void onBackPressed() {

        //thats it
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Thread timer = new Thread() {
            public void run() {

                try {
                    sleep(3000);


                } catch (InterruptedException e) {
                    e.printStackTrace();

                } finally {
                    Intent intent = new Intent("com.project.yashinfotech.MAINACTIVITY");
                    startActivity(intent);


                }
            }

        };

        timer.start();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();


        finish();

    }


}
