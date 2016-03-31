package com.bayrtserenov.android.messengertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NEW_MESSAGE = "com.bayrtserenov.android.messengertest.action.NEW_MESSAGE";

    EditText yourMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yourMessage = (EditText) findViewById(R.id.your_message);


    }

    public void sendMessage(View view) {
        Intent intent = new Intent(NEW_MESSAGE);

        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);

        intent.putExtra("message", yourMessage.getText().toString());

        sendBroadcast(intent);


    }
}
