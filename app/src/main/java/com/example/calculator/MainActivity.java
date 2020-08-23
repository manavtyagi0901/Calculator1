package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    EditText text1;
    Float res1,res2;
    boolean Add,Mul,Sub,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn10=(Button) findViewById(R.id.btn10);
        btn11=(Button) findViewById(R.id.btn11);
        btn12=(Button) findViewById(R.id.btn12);
        btn13=(Button) findViewById(R.id.btn13);
        btn14=(Button) findViewById(R.id.btn14);
        btn15=(Button) findViewById(R.id.btn15);
        btn16=(Button) findViewById(R.id.btn16);
        btn17=(Button) findViewById(R.id.btn17);
        text1=(EditText)findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"3");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"4");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"5");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"6");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"7");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"8");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"9");
            }
        });
        btn13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+".");
            }
        });
        btn14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick( View v)
            {
                text1.setText(text1.getText()+"0");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text1==null)
                {
                    text1.setText("0");
                }
                else
                {
                    res1=Float.parseFloat(text1.getText()+"");   //We get the value which store in text1 field and store into res1
                    Add=true;      //It ensure that the addition going to happen
                    text1.setText(null);

                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text1==null)
                {
                    text1.setText("0");
                }
                else
                {
                    res1=Float.parseFloat(text1.getText()+"");   //We get the value which store in text1 field and store into res1
                    Mul=true;      //It ensure that the addition going to happen
                    text1.setText(null);

                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text1==null)
                {
                    text1.setText("0");
                }
                else
                {
                    res1=Float.parseFloat(text1.getText()+"");   //We get the value which store in text1 field and store into res1
                    Sub=true;      //It ensure that the addition going to happen
                    text1.setText(null);

                }
            }
        });
        btn16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text1==null)
                {
                    text1.setText("0");
                }
                else
                {
                    res1=Float.parseFloat(text1.getText()+"");   //We get the value which store in text1 field and store into res1
                    Div=true;      //It ensure that the addition going to happen
                    text1.setText(null);

                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text1==null)
                {
                    text1.setText("");
                }
                else if(Add==true)
                {
                    res2=res1+Float.parseFloat(text1.getText()+"");
                }
                else if(Mul==true)
                {
                    res2=res1*Float.parseFloat(text1.getText()+"");
                }
                else if(Sub==true)
                {
                    res2=res1-Float.parseFloat(text1.getText()+"");
                }
                else if(Div==true)
                {
                    res2=res1/Float.parseFloat(text1.getText()+"");
                }
                text1.setText(res2+"");

            }
        });
        btn17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text1.setText(null);
            }
        });
    }
}
