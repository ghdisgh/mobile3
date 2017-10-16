package com.example.iyeonju.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText etheight,etweight, etm;
    TextView bmires, pmres;
    TabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("각종 계산기");
        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("회원 가입");
        tabHost.addTab(tab1);//1번탭 생성
        TabHost.TabSpec tab2 = tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("BMI계산기");
        tabHost.addTab(tab2);//2번탭 생성
        TabHost.TabSpec tab3 = tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("소개");
        tabHost.addTab(tab3);//3번탭 생성

        etheight = (EditText)findViewById(R.id.etheight);
        etweight = (EditText)findViewById(R.id.etweight);
        bmires = (TextView)findViewById(R.id.tvbmires);
        pmres = (TextView)findViewById(R.id.tvmetres);
    }

    public void NextScreen1(View view){

        Intent i = new Intent (this, Main2Activity.class);
        startActivity(i);

        Toast toast= Toast.makeText(getApplicationContext(), "hello2 ", Toast.LENGTH_LONG ) ;
        toast.show();

    }

    //BMI 버튼 리스너
    public void bmilistener(View v)
    {
        if (etheight.getText().toString().replace(" ","").equals("") || etweight.getText().toString().replace(" ","").equals(""))
        {
            checkemptybmi();
        }
        else
        {
            if(v.getId() == R.id.bmibutton)
            {
                double h = Double.parseDouble(etheight.getText().toString());
                double w = Double.parseDouble(etweight.getText().toString());
                double bmi = w / ((h/100) * (h/100));
                if (bmi < 18.5)
                {
                    bmires.setText("저체중이에요~");
                }
                else if (bmi >= 18.5 && bmi < 23)
                {
                    bmires.setText("정상입니다! ^ㅅ^");
                }
                else if (bmi >= 23 && bmi < 25)
                {
                    bmires.setText("과체중이에요..;ㅁ;");
                }
                else
                {
                    bmires.setText("비만입니다!!! :-(");
                }
            }
        }
    }

    public void checkemptybmi()
    {
        if(etheight.getText().toString().replace(" ","").equals(""))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
            etheight.requestFocus();
        }
        else if (etweight.getText().toString().replace(" ","").equals(""))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
            etweight.requestFocus();
        }
        else if (etweight.getText().toString().replace(" ","").equals("") && etheight.getText().toString().replace(" ","").equals(""))
        {
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
            etheight.requestFocus();
        }
    }


}
