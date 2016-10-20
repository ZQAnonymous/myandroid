package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    //声明两个参数。接收tvResult前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    int flag=0;
    boolean isClickEqu=false;//判断是否按了“=”按钮
    private String str, str1;

    private GoogleApiClient client;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = (TextView) findViewById(R.id.textView);
        final Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn2.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
               // text.setText(null);
                str = text.getText().toString();
                str1 = btn3.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn4.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn5.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn6.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
                //text.setText(null);
                str = text.getText().toString();
                str1 = btn7.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
               // text.setText(null);
                str = text.getText().toString();
                str1 = btn8.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
//                if(flag==1){
//                    text.setText(null);
//                }
               // text.setText(null);
                str = text.getText().toString();
                str1 = btn9.getText().toString();
                text.setText(str + str1);
                flag=0;
            }
        });
        final Button btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
               // text.setText(null);
                str = text.getText().toString();
                str1 = btn10.getText().toString();
                if (flag == 1) {
                    //flag=0;
                } else {
                    text.setText(str1);
                    if (str.equals("")) {
                       // text.setText(null);
                        return;
                    }
                    num1 = Double.valueOf(str);
                    //text.setText(str1);
                    text.setText(str+str1);
                    op = 1;
                    flag=1;

                    isClickEqu = false;
                }
            }
        });
        final Button btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                str1 = btn11.getText().toString();
                if (flag == 1) {
                   // return;
                } else {
                    text.setText(str1);
                    if (str.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(str);
                    // text.setText(null);
                    //text.setText(str1);
                    text.setText(str+str1);
                    op = 2;
                    flag=1;
                    isClickEqu = false;
                }
            }
        });
        final Button btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                str1 = btn12.getText().toString();
                if (flag == 1) {

                } else {
                    text.setText(str1);
                    if (str.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(str);
                    // text.setText(null);
                    //text.setText(str1);
                    text.setText(str+str1);
                    op = 3;
                    flag=1;
                    isClickEqu = false;
                }
            }
        });
        final Button btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                str1 = btn13.getText().toString();
                if (flag == 1) {

                } else {
                    text.setText(str1);
                    if (str.equals(null)) {
                        return;
                    }
                    num1 = Double.valueOf(str);
                    // text.setText(null);
                    text.setText(str+str1);
                    //text.setText(str1);
                    op = 4;
                    flag=1;
                    isClickEqu = false;
                }
            }
        });
        final Button btn14 = (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                str1 = btn14.getText().toString();
                text.setText(str + str1);
            }
        });

        final Button btn16 = (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                if(flag==1){
                    text.setText(null);
                }
                str = text.getText().toString();
                str1 = btn16.getText().toString();

                text.setText(str + str1);
                flag=0;
            }

        });
        final Button btn15 = (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                str1 = btn15.getText().toString();
                if(str.equals(""))
                {
                    return;
                }
                else{
                    text.setText(str.substring(0, str.length() - 1));
                }

            }

        });
        final Button btn17 = (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str=text.getText().toString();
                String str2=String.valueOf(num1);
                if(str.equals(""))
                {
                    return;
                }
                num2=Double.valueOf(str1);
                String str1=String.valueOf(num2);
                switch (op) {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                       // text.setText(str2+"+"+str1+"="+Result);
                        str=String.valueOf(Result);
                        text.setText(str);
                        break;
                    case 2:
                        Result=num1-num2;
                       // text.setText(str2+"-"+str1+"="+Result);
                        str=String.valueOf(Result);
                        text.setText(str);
                        break;
                    case 3:
                        Result=num1*num2;
                        str=String.valueOf(Result);
                        text.setText(str);
                        break;
                    case 4:
                        Result=num1/num2;
                        str=String.valueOf(Result);
                        text.setText(str);
                        break;
                    default:
                        text.setText(null);
                        break;
                }
                isClickEqu=true;
            }
        });

        final Button btn18 = (Button) findViewById(R.id.button18);
        btn18.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                text.setText(null);
            }

        });
        final Button btn19 = (Button) findViewById(R.id.button19);
        btn19.setOnClickListener(new Button.OnClickListener() {//创建监听
            public void onClick(View v) {
                str = text.getText().toString();
                double d = Double.valueOf(str);
                int in = (int) d;
                double r = d - in;
                StringBuilder stringBuilder = new StringBuilder();
                //将整数部分转换成二进制
                int remainder = 0;
                int quotient = 0;
                while (in != 0) {
                    quotient = in / 2;
                    remainder = in % 2;
                    stringBuilder.append(remainder);
                    in = quotient;
                }
                stringBuilder.reverse();
                if (r != 0) {
                    stringBuilder.append(".");

                    //将小数部分转换成二进制
                    int count = 8;
                    double num = 0;
                    while (r > 0.0000000001) {
                        count--;
                        if (count == 0) {
                            //throw new Exception("Cannot change the ");
                        }
                        num = r * 2;
                        if (num >= 1) {
                            stringBuilder.append(1);
                            r = num - 1;
                        } else {
                            stringBuilder.append(0);
                            r = num;
                        }
                    }

                }
                str1 = stringBuilder.toString();
                text.setText(str1);
            }
        });

    }


}
