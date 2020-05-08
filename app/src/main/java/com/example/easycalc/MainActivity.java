package com.example.easycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] operations = {"add", "subtract", "multiply", "divide"};
    String selectedOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner operationSpinner = (Spinner) findViewById(R.id.operationSpinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, operations);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operationSpinner.setAdapter(arrayAdapter);

        operationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedOperation = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do nothing
            }
        });


        Button computeBtn = findViewById(R.id.computeBTN);
        computeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float res;
                EditText firstNum = (EditText) findViewById(R.id.number1);
                EditText secondNum = (EditText) findViewById(R.id.number2);
                TextView resultTextView = (TextView) findViewById(R.id.result_textView);
                try {
                    float f = Float.parseFloat(firstNum.getText().toString());
                    float s = Float.parseFloat(secondNum.getText().toString());
                    switch(selectedOperation) {
                        case "add":
                            res = f + s;
                            break;
                        case "subtract":
                            res = f - s;
                            break;
                        case "multiply":
                            res = f*s;
                            break;
                        case "divide":
                            res = f/s;
                            break;
                        default: res = -1;
                    }
                    resultTextView.setText(Float.toString(res));
                } catch (Exception e) {
                    resultTextView.setText("Please enter valid numbers");
                }
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
