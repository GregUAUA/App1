package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoAudioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_audio);

        // установите свой путь к файлу на SD-карточке
        String videoSource ="/Card/Nostalgia Critic - Face-Off - Без Лица (rus mvo).mp4";

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath(videoSource);

        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus(0);
        videoView.start(); // начинаем воспроизведение автоматически

    }
}
