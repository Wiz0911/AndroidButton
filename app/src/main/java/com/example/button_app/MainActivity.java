package com.example.button_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String ACTIVITY_TAG="Tag";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * login
     * @param v
     */
    public void login(View v) {
        Log.i(ACTIVITY_TAG,"button click");
    }
}