package com.pegasus1501.birthdaysurprise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.black));

        videoView = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnCompletionListener(view -> {
            Toast.makeText(VideoActivity.this, "Enjoy Your Day!!!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}