package com.example.labo3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_1.utils.AppConstamts;

public class newActivity extends AppCompatActivity {
    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mText = findViewById(R.id.txt);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            mText.setText(mIntent.getStringExtra(AppConstamts.TEXT_KEY));
        }
    }
}
