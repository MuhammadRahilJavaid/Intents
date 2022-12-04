package com.example.lecture_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IT extends AppCompatActivity {
    Button btn;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("A1 IT", "Create");

        btn = findViewById(R.id.button);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IT.this, MainActivity.class);
                String message = "Hey";
                intent.putExtra("Message", message);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("A1 IT", "Restarting");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("A1 IT", "Starting");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("A1 IT", "Resuming");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("A1 IT", "stoping");

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("A1 IT", "Destroying");

    }

}