package com.example.activity.lifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    private final static String TAG = "ActivityMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        Button normalBtn = (Button) findViewById(R.id.start_normal_activity);

        Button dialogBtn = (Button) findViewById(R.id.start_dialog_activity);

        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMain.this, NormalActivity.class);
                startActivity(intent);

            }
        });

        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMain.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestory");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
