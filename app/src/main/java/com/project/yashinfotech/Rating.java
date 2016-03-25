package com.project.yashinfotech;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Rating extends Fragment implements RatingBar.OnRatingBarChangeListener{

    TextView tv;
    Button btn;
    RatingBar rb;

    public Rating(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.rating, container, false);

        tv = (TextView) rootView.findViewById(R.id.textView10);
        rb = (RatingBar) rootView.findViewById(R.id.ratingBar);
        btn= (Button) rootView.findViewById(R.id.ratingbutton);
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("market://details?id=com.project.yashinfotech"));
               startActivity(intent);
           }
  });


        rb.setOnRatingBarChangeListener(this);
        return rootView;
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        if(rating <= 1)
            tv.setText("Rating : Needs Improvement");
        else if (rating <= 2)
            tv.setText("Rating : Not Bad");
        else if( rating <= 3)
            tv.setText("Rating : Good");
        else if (rating <=4)
            tv.setText("Rating : Very Good");
        else if (rating <=5)
            tv.setText("Rating : Excellent");


    }
}
