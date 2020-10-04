package com.example.noweefinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Status extends AppCompatActivity {

    private Button msgBtn = null;
    private EditText msgText = null;
    private String message = null;
    static final int SEND_MESSAGE = 3; // STATUS VALUE
    static final int SMS_PERMISSION_REQ = 123; // PERMISSIONS VALUE

    //STATUS page(profile picture, message, send your message, IT NEEDS a dedicated back btn???)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status_list);

        Intent intent = getIntent();

    }
}
