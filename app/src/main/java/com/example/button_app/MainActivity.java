package com.example.button_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

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
    public void clickEvent(View v) {
        final EditText textAccount =(EditText) findViewById (R.id.id_edit_account);
        final EditText textPassWord =(EditText) findViewById (R.id.id_edit_pass_word);

        if (v.getId() == R.id.id_forget_pass_word)
        {
            Log.i(ACTIVITY_TAG,"forget pass world");
        }
        else if (v.getId() == R.id.id_register)
        {
            Log.i(ACTIVITY_TAG,"register");
        }
        else if (v.getId() == R.id.id_login_btn)
        {
            Log.i(ACTIVITY_TAG,"登陆信息：");
            Log.i(ACTIVITY_TAG,"账号：" + textAccount.getText().toString());
            Log.i(ACTIVITY_TAG,"密码：" + textPassWord.getText().toString());
        }
    }
}