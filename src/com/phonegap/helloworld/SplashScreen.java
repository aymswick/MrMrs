package com.phonegap.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;

/**
 * Created by pedroMunoz on 11/21/15.
 */
public class SplashScreen extends Activity {
    //splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            //show splash with timer
            @Override
            public void run() {
                //executed once timer is over to start main app
                //intent = new Intent(SplashScreen.this, MainActivity.class);
                //startActivity(intent);

                Intent intent = new Intent();
                intent.setClass(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


                //close splash screen activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
