package com.example.pver.miss2008;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.miss2008_dailynews_ui.DailynewsObaserver;
import com.example.miss2008_message_ui.MessageObserver;
import com.example.miss2008_music_ui.MusicObserver;
import com.example.miss2008_resource_ui.LoginSuccessSubjectImpl;
import com.example.miss2008_video_ui.VideoObserver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
