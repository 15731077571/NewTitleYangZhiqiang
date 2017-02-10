package com.example.lenovo.newtitleyangzhiqiang;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo.newtitleyangzhiqiang.fragment.F1;
import com.example.lenovo.newtitleyangzhiqiang.fragment.F2;
import com.example.lenovo.newtitleyangzhiqiang.fragment.F3;
import com.example.lenovo.newtitleyangzhiqiang.fragment.F4;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private TextView b1,b2,b3,b4;
    private FrameLayout framelyout;
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //初始化控件
            initviews();
       f1=new F1();
        f2 = new F2();
        f3 = new F3();
        f4 = new F4();
        getSupportFragmentManager().beginTransaction().add(R.id.framelayout, f1).commit();
        b1.setTextColor(Color.RED);
    }

    private void initviews() {
        framelyout = (FrameLayout) findViewById(R.id.framelayout);
        b1 = (TextView) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);
        b4 = (TextView) findViewById(R.id.b4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.b1:
                ColorSelete();
                IconSelete();
               b1.setSelected(true);

                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,f1).commit();
                b1.setTextColor(Color.RED);
                break;
            case R.id.b2:
                ColorSelete();
                IconSelete();
                b2.setSelected(true);
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,f2).commit();
                b2.setTextColor(Color.RED);
                break;
            case R.id.b3:
                ColorSelete();
                IconSelete();
                b3.setSelected(true);
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,f3).commit();
                b3.setTextColor(Color.RED);
                break;
            case R.id.b4:
                ColorSelete();
                IconSelete();
                b4.setSelected(true);
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,f4).commit();
                b4.setTextColor(Color.RED);
                break;
        }
    }

    private void IconSelete() {
        b3.setSelected(false);
        b2.setSelected(false);
        b1.setSelected(false);
        b4.setSelected(false);
    }

    private void ColorSelete() {
        b1.setTextColor(Color.BLACK);
        b2.setTextColor(Color.BLACK);
        b3.setTextColor(Color.BLACK);
        b4.setTextColor(Color.BLACK);
    }
}
