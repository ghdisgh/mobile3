package com.example.iyeonju.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout =
                (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("로그인"));
        tabLayout.addTab(tabLayout.newTab().setText("회원가입"));
        tabLayout.addTab(tabLayout.newTab().setText("나의 소개"));

        final ViewPager viewPager =
                (ViewPager) findViewById(R.id.pager);

        final PagerAdapter adapter = new Main2Activity
                (getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup) ;
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

    }

    public void NextScreen3(View view){

        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

        Toast toast= Toast.makeText(getApplicationContext(), "메인페이지", Toast.LENGTH_LONG ) ;
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
