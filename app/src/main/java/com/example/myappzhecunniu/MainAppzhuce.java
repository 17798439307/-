package com.example.myappzhecunniu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainAppzhuce extends AppCompatActivity {
    private Button mButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appzhuce);
        mButton = (Button) findViewById(R.id.tv_aa);
        mTextView = (TextView) findViewById(R.id.tv_bb);
        mTextView.setText("今天是星期三");
        EventBus.getDefault().register(this);
        jumpActivity();
    }

    private void jumpActivity() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainAppzhuce.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void Event(Beis beis) {
        mTextView.setText(beis.getMessage());
    }
    protected  void onDestroy(){
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this);
        }
    }
}
