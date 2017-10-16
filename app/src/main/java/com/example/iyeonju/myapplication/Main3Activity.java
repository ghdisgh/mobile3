package com.example.iyeonju.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void NextScreen1(View view){

        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

        Toast toast= Toast.makeText(getApplicationContext(), "hello2 ", Toast.LENGTH_LONG ) ;
        toast.show();

    }
}
