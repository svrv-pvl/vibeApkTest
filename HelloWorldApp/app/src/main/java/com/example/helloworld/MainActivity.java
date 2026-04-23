package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Создаем TextView программно
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextSize(32);
        textView.setGravity(android.view.Gravity.CENTER);
        
        setContentView(textView);
    }
}
