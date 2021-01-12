package com.example.photo_frame_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView pic;
    ImageButton prev, next;
    TextView status;
    int curr = 0, noOfImg = 5;
    String [] statusbar = {"Nature1", "Nature2", "Nature3", "Nature4", "Nature5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v) {
        status = findViewById(R.id.status);
        String idx = "pic" + curr;
        int x = this.getResources().getIdentifier(idx, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        curr = (curr-1+noOfImg) % noOfImg;
        String idy = "pic" + curr;
        int y = this.getResources().getIdentifier(idy, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        status.setText(statusbar[curr]);
    }
    public void next(View v) {
        status = findViewById(R.id.status);
        String idx = "pic" + curr;
        int x = this.getResources().getIdentifier(idx, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        curr = (curr+1) % noOfImg;
        String idy = "pic" + curr;
        int y = this.getResources().getIdentifier(idy, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        status.setText(statusbar[curr]);
    }
}