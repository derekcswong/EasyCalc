package com.example.easycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result_textView = (TextView) findViewById(R.id.number1);
        Button equals = (Button) findViewById(R.id.equal);
        Button clear = (Button) findViewById(R.id.clear);
        Button decimal = (Button) findViewById(R.id.decimal);
        Button zero = (Button) findViewById(R.id.zero);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button divide = (Button) findViewById(R.id.divide);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button mod = (Button) findViewById(R.id.mod);
        Button add = (Button) findViewById(R.id.add);
        Button left_bracket = (Button) findViewById(R.id.bracket_left);
        Button right_bracket = (Button) findViewById(R.id.bracket_right);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.setSelected(true);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("9");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(" / ");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(" x ");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(" - ");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(" + ");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(" % ");
            }
        });
        right_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append(")");
            }
        });
        left_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_textView.append("(");
            }
        });

        Button testYourselfBTN = (Button) findViewById(R.id.button2);
        testYourselfBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTest = new Intent (getApplicationContext(), Test.class);
                startActivity(goToTest);
            }
        });
    }
}
