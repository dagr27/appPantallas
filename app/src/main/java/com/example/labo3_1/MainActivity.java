package com.example.labo3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Button;

import com.example.labo3_1.utils.AppConstamts;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, newActivity.class);
                mIntent.putExtra(AppConstamts.TEXT_KEY, "Hola, New Activity");
                startActivity(mIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(Intent.EXTRA_TEXT, "Dale omar deja el picheo y dale dale dale duro al perrreo");
                startActivity(mIntent);
            }
        });
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d( TAG, "On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( TAG, "On Stop");
    }
}
