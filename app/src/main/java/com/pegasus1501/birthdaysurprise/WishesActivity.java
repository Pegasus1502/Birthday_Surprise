package com.pegasus1501.birthdaysurprise;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.widget.TextView;


public class WishesActivity extends AppCompatActivity {

    public static final String NAME = "NAME";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishes);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.first));

        int secondsDelayed = 1;
        new Handler().postDelayed(() -> {
            startActivity(new Intent(WishesActivity.this, VideoActivity.class));
            finish();
        }, secondsDelayed * 2000);

        TextView nameShow = findViewById(R.id.nameShow);
        Intent i = getIntent();
        String name = i.getStringExtra(NAME);
        nameShow.setText(name +"!");
    }
}