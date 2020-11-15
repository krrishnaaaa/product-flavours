package com.pcsalt.example.productflavors;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.pcsalt.example.productflavors.utils.MyLog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);

        textView.setText(getString(R.string.app_name) + " - " + BuildConfig.VERSION_NAME);

        MyLog.e(TAG, "some error log");
    }
}
