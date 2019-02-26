package com.example.myappzhecunniu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {
    private Button mButon2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mButon2 = (Button) findViewById(R.id.tv_cc);
        jumpActivity();
    }

    private void jumpActivity() {
        mButon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().post(new Beis("欢迎大家浏览我写的博客"));
                finish();
            }
        });
    }
}
