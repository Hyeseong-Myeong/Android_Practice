package com.mhs.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자", Toast.LENGTH_LONG).show();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickCount += 1;

                Toast.makeText(getApplicationContext(),"clickCount " + clickCount, Toast.LENGTH_SHORT).show();
            }
        });
    }
}