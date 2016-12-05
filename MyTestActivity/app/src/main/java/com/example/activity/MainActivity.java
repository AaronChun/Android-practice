package com.example.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BasicActivity {

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        final EditText textView = (EditText) findViewById(R.id.main_text);

//        final String textStr = textView.getText().toString();

//        Log.d(TAG, "TextView:" + textStr);


        Button button = (Button) findViewById(R.id.main_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("data",textView.getText().toString());
                startActivityForResult(intent,1);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
               if(resultCode==RESULT_OK){
                   String stringExtra = data.getStringExtra("back_data");
                   Toast.makeText(MainActivity.this, "上一视图返回信息为:" + stringExtra, Toast.LENGTH_SHORT).show();
               }
                break;
            default:
        }



    }



}
