package com.bangera.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView res;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        res=findViewById(R.id.result);
    }
    public void number(View v)
    {
        Button b=(Button) v;
        String s=(String)b.getText();
        if (number1.hasFocus())
            number1.append(s);
        else if(number2.hasFocus())
            number2.append(s);
        else
            Toast.makeText(this, "Please select the field", Toast.LENGTH_SHORT).show();
    }
    public void add(View v)
    {
        op='+';
    }
    public void multiply(View v)
    {
        op='*';
    }
    public void divide(View v)
    {
        op='/';
    }
    public void minus(View v)
    {
        op='-';
    }

    public void compute(View v)
    {
        float n1,n2,r;
        n1=Float.parseFloat(number1.getText().toString());
        n2=Float.parseFloat(number2.getText().toString());
        switch (op)
        {
            case '+':
                r = n1 + n2;
                res.setText("" + n1 + "+" + n2 + "=" + r);
                break;
            case '-':
                r = n1 - n2;
                res.setText("" + n1 + "-" + n2 + "=" + r);
                break;
            case '/':
                r = n1 / n2;
                res.setText("" + n1 + "/" + n2 + "=" + r);
                break;
            case '*':
                r = n1 * n2;
                res.setText("" + n1 + "*" + n2 + "=" + r);
                break;
            default:
                break;
        }
    }
    public void allclear(View v)
    {
        number1.setText("");
        number2.setText("");
        res.setText("");
    }
}