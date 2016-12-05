package com.example.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends BasicActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);
        Intent intent = getIntent();
        final String recvStr = intent.getStringExtra("data");

        final EditText textView = (EditText) findViewById(R.id.second_text);

        Toast.makeText(SecondActivity.this,"从主视图接收到的信息为:"+recvStr,Toast.LENGTH_SHORT).show();

        textView.setText(recvStr);


        Button button = (Button) findViewById(R.id.second_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                /*intent1.putExtra("back_data", "back:" + textView.getText().toString());
                setResult(RESULT_OK,intent1);
                finish();*/
                intent1.setData(Uri.parse(textView.getText().toString()));

                startActivity(intent1);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("back_data","backData");
        setResult(RESULT_OK,intent);
        finish();
    }
}
