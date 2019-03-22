package com.example.labo3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        txt = findViewById(R.id.txt);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            txt.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
