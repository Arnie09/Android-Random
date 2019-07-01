package com.example.dataoverhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = findViewById(R.id.send_button);

    }
    public void onSend(View view){
        MessageSender messageSender = new MessageSender();
        messageSender.execute("Hello");
    }
}
