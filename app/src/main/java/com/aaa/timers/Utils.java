package com.aaa.timers;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class Utils extends Activity {


    public void getDelay() {
        //timer log for 2 sec
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.e("run: ", "Two seconds are passed");
                handler.postDelayed(this, 2000);
            }
        };
        handler.post(runnable);
    }


    public void getTimer() {
        CountDownTimer mTimer = new CountDownTimer(10000, 1000) {
            //parameter for one sec
            @Override
            public void onTick(long millisUntilFinished) {
                Log.e("myTimer: ", millisUntilFinished / 1000 + "seconds left.");
            }
            @Override
            public void onFinish() {
                Log.e("myTimer: ", "Finish!");
            }
        };
    }
}
