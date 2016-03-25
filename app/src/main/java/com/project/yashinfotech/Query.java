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
import android.widget.EditText;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Query extends Fragment implements View.OnClickListener {

    EditText personsEmail, subject, complaint,details ;
    String emailAdd, sub, text, detail;


    Button sendEmail;

    public Query(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.query, container, false);
        personsEmail = (EditText) rootView.findViewById(R.id.etEmails1);
        subject = (EditText) rootView.findViewById(R.id.etIntro1);
        complaint = (EditText) rootView.findViewById(R.id.etName1);
        details = (EditText) rootView.findViewById(R.id.etName2);
        sendEmail = (Button) rootView.findViewById(R.id.bSentEmail1);
        sendEmail.setOnClickListener(this);
        return rootView;
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void onClick(View v) {
        // TODO Auto-generated method stub

        convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();
        String emailaddress[] = {emailAdd};
        String message = " My query: " + text + " Details that could be helpful: " + detail;
        Intent emailintent = new Intent(Intent.ACTION_SEND);
        emailintent.putExtra(Intent.EXTRA_EMAIL, emailaddress);
        emailintent.putExtra(Intent.EXTRA_SUBJECT, sub);
        emailintent.setType("plain/text");
        emailintent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(emailintent);



    }

    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
        // TODO Auto-generated method stub
        emailAdd = personsEmail.getText().toString();
        sub = subject.getText().toString();
        text = complaint.getText().toString();
        detail = details.getText().toString();

    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

    }

}