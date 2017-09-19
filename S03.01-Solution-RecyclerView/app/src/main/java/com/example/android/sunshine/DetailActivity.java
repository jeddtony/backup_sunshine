package com.example.android.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.sunshine.R;

public class DetailActivity extends AppCompatActivity {
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    textView = (TextView) findViewById(R.id.show_text);
        String textPassed ;

        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
          textPassed = intent.getStringExtra(Intent.EXTRA_TEXT);
            textView.setText(textPassed);
        }

    }
}
