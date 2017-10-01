package com.example.pver.miss2008;

import android.app.Application;
import android.util.Log;

import com.example.miss2008_dailynews_ui.DailynewsObaserver;
import com.example.miss2008_message_ui.MessageObserver;
import com.example.miss2008_music_ui.MusicObserver;
import com.example.miss2008_resource_ui.LoginSuccessSubjectImpl;
import com.example.miss2008_video_ui.VideoObserver;

/**
 * @version : 1.0
 * @Description : TODO
 * @autho : dongyiming
 * @data : 2017/9/30 3:55
 * @package : com.example.pver.miss2008
 */
public class MissApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LoginSuccessSubjectImpl.getInstance().registerObserver(new MusicObserver());
        LoginSuccessSubjectImpl.getInstance().registerObserver(new VideoObserver());
        LoginSuccessSubjectImpl.getInstance().registerObserver(new DailynewsObaserver());
        LoginSuccessSubjectImpl.getInstance().registerObserver(new MessageObserver());
        new Thread(new Runnable() {
            @Override
            public void run() {
                //登陆操作
                Log.e("miss08", "登陆成功，通知所有观察者...");
                LoginSuccessSubjectImpl.getInstance().notifyObservers();
            }
        }).start();
    }
}
