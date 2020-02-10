package com.example.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnMultiply, btnDivide,btnEqual;
    Button btnDot,btnDel;
    TextView tvInput,tvOutput;
    String proces, funkcia;
    Double san1, san2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn_zero);
        btn1=findViewById(R.id.btn_one);
        btn2=findViewById(R.id.btn_two);
        btn3=findViewById(R.id.btn_three);
        btn4=findViewById(R.id.btn_four);
        btn5=findViewById(R.id.btn_five);
        btn6=findViewById(R.id.btn_six);
        btn7=findViewById(R.id.btn_seven);
        btn8=findViewById(R.id.btn_eight);
        btn9=findViewById(R.id.btn_nine);

        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMultiply=findViewById(R.id.btn_multiply);
        btnDivide =findViewById(R.id.btn_divide);
        btnDel=findViewById(R.id.btn_back);
        btnDot=findViewById(R.id.btn_dot);

        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                proces = proces.substring(0, proces.length()- 1);
                tvInput.setText(proces+"");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+"9");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                san1=Double.parseDouble(proces);
                funkcia="+";
                tvInput.setText("");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                san1=Double.parseDouble(proces);
                funkcia="-";
                tvInput.setText("");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                san1=Double.parseDouble(proces);
                funkcia="*";
                tvInput.setText("");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                san1=Double.parseDouble(proces);
                funkcia="/";
                tvInput.setText("");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                tvInput.setText(proces+".");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proces=tvInput.getText().toString();
                san2=Double.parseDouble(proces);
                if (funkcia.equals("+")) {
                    tvInput.setText(String.valueOf(san1+san2));
                }
                else if (funkcia.equals("-")) {
                    tvInput.setText(String.valueOf(san1-san2));
                }
                else if (funkcia.equals("*")) {
                    tvInput.setText(String.valueOf(san1*san2));

                }
                else if (funkcia.equals("/")) {
                    tvInput.setText(String.valueOf(san1/san2));
                }
            }
        });
    }
}