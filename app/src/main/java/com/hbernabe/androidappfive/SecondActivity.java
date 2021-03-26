package com.hbernabe.androidappfive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtViewMsgReciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        setTitle("Second Activity");
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

        txtViewMsgReciever = findViewById(R.id.txtViewMsgReciever);
        txtViewMsgReciever.setText(msg);

        Button btnReturnAct = (Button) findViewById(R.id.btnReturnAct);

        btnReturnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}