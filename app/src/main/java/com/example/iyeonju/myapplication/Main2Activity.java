package com.example.iyeonju.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("DEBUG", "Hello at the Main2Activity");

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup) ;
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup.setOnCheckedChangeListener(radioGroupButtonChangeListener);

    }

    RadioGroup.OnCheckedChangeListener radioGroupButtonChangeListener = new RadioGroup.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
            if (i==R.id.radioButton2){
                Toast.makeText(Main2Activity.this, "여자", Toast.LENGTH_SHORT).show();
            }
            else if (i==R.id.radioButton){
                Toast.makeText(Main2Activity.this, "남자", Toast.LENGTH_SHORT).show();
            }
        }
    };

    protected void onPause() {
        super.onPause();
        Log.i("TAG", "HYWU on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "HYWU on Create");
    }


    public void NextScreen2(View view){

        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

        Toast toast= Toast.makeText(getApplicationContext(), "hello2 ", Toast.LENGTH_LONG ) ;
        toast.show();

    }

    public void copy(View view){
        EditText aa = (EditText) findViewById(R.id.editText7);
        aa.getText();

        TextView bb = (TextView) findViewById(R.id.editText5);
        bb.getText();

        TextView cc = (TextView) findViewById(R.id.editText2);
        cc.getText();

        TextView dd = (TextView) findViewById(R.id.editText3);
        dd.getText();

    }

}
