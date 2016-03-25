package com.project.yashinfotech;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewFlipper;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btn, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    Button button2, button3, button4, button5, button8, button9, button7, button10, button12;
    ViewFlipper flippy;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        btn = (Button) rootView.findViewById(R.id.button2);
        btn2 = (Button) rootView.findViewById(R.id.button1);
        btn3 = (Button) rootView.findViewById(R.id.button4);
        btn5 = (Button) rootView.findViewById(R.id.button5);
        btn6 = (Button) rootView.findViewById(R.id.button6);
        btn10 = (Button) rootView.findViewById(R.id.button13);
        btn12 = (Button) rootView.findViewById(R.id.button10);
        button5 = (Button) rootView.findViewById(R.id.btn5);
        btn7 = (Button) rootView.findViewById(R.id.button7);
        button8 = (Button) rootView.findViewById(R.id.btncreative8);
        button9 = (Button) rootView.findViewById(R.id.btn9);
        btn11 = (Button) rootView.findViewById(R.id.btn1);
        button2 = (Button) rootView.findViewById(R.id.btn2);
        button3 = (Button) rootView.findViewById(R.id.btn3);
        button7 = (Button) rootView.findViewById(R.id.btn7);
        button4 = (Button) rootView.findViewById(R.id.btn4);
        btn9 = (Button) rootView.findViewById(R.id.button8);
        button10 = (Button) rootView.findViewById(R.id.btn10);
        button12 = (Button) rootView.findViewById(R.id.btncanon12);
        btn8 = (Button) rootView.findViewById(R.id.button11);
        btn4 = (Button) rootView.findViewById(R.id.buttontokeyboard);
        flippy = (ViewFlipper) rootView.findViewById(R.id.flipper);
        //flippy.setOnClickListener(this);
        flippy.setFlipInterval(2300);
        flippy.startFlipping();


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.ZEBRONICS");
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.CREATIVE");
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.LOGITECH");
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.MICROSOFT");
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.RAM");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.SAPPHIRE");
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.ZOTAC");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.QUICKHEAL");
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.SOUNDCARD");
                startActivity(intent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.CATRIDGES");
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.LANCARD");
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.MOUSE");
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.ANTIVIRUS");
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.GRAPHICCARD");
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.KEYBOARD");
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.SPEAKER");
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.MOTHERBOARD");
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.RAM");
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.HEADPHONE");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.KASPERSKY");
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.project.yashinfotech.CANON");
                startActivity(intent);
            }
        });
        return rootView;
    }

    @Override
    public void onClick(View v) {
        flippy.showNext();

    }
}
