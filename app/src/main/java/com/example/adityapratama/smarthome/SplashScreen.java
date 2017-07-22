package com.example.adityapratama.smarthome;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {


    //set time splash screen 2 sec
    private static int splashInterval = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //mengarahkan activity splash screen ke main activity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);

            }
            private void finish(){

            }
        },splashInterval);
    }
}
