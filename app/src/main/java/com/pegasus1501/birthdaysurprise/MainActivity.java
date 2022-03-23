package com.pegasus1501.birthdaysurprise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText getName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.wish));
        getName = findViewById(R.id.getName);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(view -> {

            if (TextUtils.isEmpty(getName.getText().toString()))
            {
                Toast.makeText(MainActivity.this, "Please Enter Your Name!!!", Toast.LENGTH_SHORT).show();

            }
            else
            {
                sendData();
            }
        });
    }

    private void sendData() {
        String name = getName.getText().toString().trim();
        Intent i = new Intent(MainActivity.this, WishesActivity.class);
        i.putExtra(WishesActivity.NAME, name);
        startActivity(i);
        finish();
    }


}