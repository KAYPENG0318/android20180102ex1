package com.wanna.android20180102ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn3,btn4;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3=(Button)findViewById(R.id.button3);
        //MyListener listener=new MyListener();
        btn3.setOnClickListener(this);
        btn4 =(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        tb=(ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.isChecked())
                {
                    Toast.makeText(MainActivity.this, "開啟中", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "關閉中", Toast.LENGTH_SHORT).show();
                }
            }
        });





        //內部匿名類別

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
        switch(view.getId())
        {
            case R.id.button4:
                Toast.makeText(MainActivity.this, "Text4", Toast.LENGTH_SHORT).show();
                break;
        }
    }




    public void click1(View v)
    {
        switch(v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this, "Text", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Text2", Toast.LENGTH_LONG).show();
                break;
        }

    }
    public void clickCheck(View v)
    {
        if (tb.isChecked())
        {
            Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "目前關閉中", Toast.LENGTH_SHORT).show();
        }
    }
}
