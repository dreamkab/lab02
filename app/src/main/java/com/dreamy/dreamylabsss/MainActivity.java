package com.dreamy.dreamylabsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void base(View v)
    {
        EditText txt_A = findViewById(R.id.TextBoxA);
        EditText txt_B = findViewById(R.id.TextBoxB);
        TextView txt_Res = findViewById(R.id.TextViewResult);



        Button ADD = findViewById(R.id.buttonADD);
        Button SUB = findViewById(R.id.buttonSUB);
        Button MULT = findViewById(R.id.buttonMULT);
        Button DIV = findViewById(R.id.buttonDIV);
        Button SIN = findViewById(R.id.buttonSIN);
        Button COS = findViewById(R.id.buttonCOS);
        Button TAN = findViewById(R.id.buttonTAN);
        Button SQRT = findViewById(R.id.buttonSQRT);
        Button POW = findViewById(R.id.buttonPOW);

        RadioButton Radian = findViewById(R.id.Radians);
        RadioButton Numbers = findViewById(R.id.Numbers);

        String Action_A = txt_A.getText().toString();
        String Action_B = txt_B.getText().toString();


        double a = 0,  r = 0 , b = 0;
        try {
            a = Double.parseDouble(Action_A);
            b = Double.parseDouble(Action_B);
        } catch (Exception e1) {
            txt_Res.setText("input blocks are empty or incorrect number format is entered");
            return;
        }

        if (v == ADD) r = a + b;
        if (v == SUB) r = a - b;
        if (v == MULT) r = a * b;
        if (v == DIV)
        {
            if (b == 0)
            {
                txt_Res.setText("division by zero is impossible");
                return;
            }
            r = a / b;
        }
        if (v == POW) r =  Math.pow(a, b);
        if (v == SIN) r = Math.sin(a);
        if (v == COS) r = Math.cos(a);
        if (v == TAN){
            if (a == 90 || a == 270){
                txt_Res.setText("Error 90 or 270 tan");
                return;
            }
            else {
                r = Math.tan(a);
            }
        }

        if (v == SQRT) {
            if (a < 0) {
                txt_Res.setText("You can't take the sqrt of a negative number");
                return;
            }
            r = Math.sqrt(a);
        }

        String recordResult = String.valueOf(r);
        txt_Res.setText(recordResult);
    }
}