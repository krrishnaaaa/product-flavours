package com.pcsalt.example.productflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pcsalt.example.productflavors.utils.MyLog;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        textView.setText(R.string.app_name);

        MyLog.e(TAG, "some error log");
    }
}
