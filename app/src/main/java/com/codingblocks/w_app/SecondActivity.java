package com.codingblocks.w_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = findViewById(R.id.tvResult);

        Intent IntentThatStartedThis = getIntent();
        int result = IntentThatStartedThis.getIntExtra("result" , 0);

        tvResult.setText(String.valueOf(result));
    }
}
