package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPercent,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnClear,btnBack,btnEqual,btnDot,btnGo;
    double num1,num2;
    boolean Add,Sub,Mul,Div,percent;
    EditText result;
    char symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btn0=findViewById(R.id.btn0);
        btnEqual=findViewById(R.id.btnEqual);
        btnDot=findViewById(R.id.btnDot);
        btnClear=findViewById(R.id.btnClear);
        btnBack=findViewById(R.id.btnBack);
        btnGo=findViewById(R.id.btnGo);
        result=findViewById(R.id.result);
        btnPercent=findViewById(R.id.btnPercent);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null)
                    result.setText("");

                else
                    result.setText(result.getText()+".");

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = result.getText().toString();
                if (!data.isEmpty()) {
                    num1=Double.parseDouble(String.valueOf(result.getText()));
                    Add=true;
                    symbol = '+';
                    result.setText(result.getText() + "+");
                }

            }});
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = result.getText().toString();
                if (!data.isEmpty()) {
                    num1=Double.parseDouble(String.valueOf(result.getText()));
                    Sub=true;
                    symbol='-';
                    result.setText(result.getText() + "-");
                }

            }});
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = result.getText().toString();
                if (!data.isEmpty()) {
                    num1=Double.parseDouble(String.valueOf(result.getText()));
                    Mul=true;
                    symbol = '×';

                    result.setText(result.getText() + "×");
                }

            }});
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = result.getText().toString();
                if (!data.isEmpty()){
                    num1=Double.parseDouble(String.valueOf(result.getText()));
                    Div=true;
                    symbol = '÷';

                    result.setText(result.getText() + "÷");
                }

            }});
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = result.getText().toString();
                if (!data.isEmpty())
                num2=Double.parseDouble(result.getText().toString().substring(result.getText().toString().indexOf(symbol)+1));
                if(Add==true){
                    double addAns = num1+num2;
                    result.setText(String.valueOf(addAns));
                    Add=false;
                }

                if(Sub==true){
                    double addAns = num1-num2;
                    result.setText(String.valueOf(addAns));
                    Sub=false;
                }
                if(Mul==true){
                    double addAns = num1*num2;
                    result.setText(String.valueOf(addAns));
                    Mul=false;
                }
                if(Div==true){
                    double addAns = num1/num2;
                    result.setText(String.valueOf(addAns));
                    Div=false;
                }
                if(percent==true){
                    double addAns = num1%num2;
                    result.setText(String.valueOf(addAns));
                    percent=false;}



            }

        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!result.getText().toString().equals("")){
                    String value=result.getText().toString();
                if(value.length()>0){
                    value=value.substring(0,value.length()-1);
                    result.setText(value);
                }
            }
        }}
        );
     btnPercent.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String data = result.getText().toString();
             if (!data.isEmpty()) {
                 num1=Double.parseDouble(String.valueOf(result.getText()));
                 percent=true;
                 symbol = '%';

                 result.setText(result.getText() + "%");
             }
         }
     });

     /* btnGo.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent viewIntent=new Intent("andiod.intent.action.VIEW", Uri.parse("https://www.youtube.com/c/Lawsaurabh"));
             startActivity(viewIntent);
         }
     }); */

    }

    }
