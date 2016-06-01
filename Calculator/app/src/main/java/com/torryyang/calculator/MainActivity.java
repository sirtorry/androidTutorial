package com.torryyang.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAdd;
    private Button btnSub;
    private Button btnDiv;
    private Button btnMul;
    private TextView txtResult;
    private Button btnClr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnDiv = (Button) findViewById(R.id.buttonDiv);
        btnMul = (Button) findViewById(R.id.buttonMul);
        btnClr = (Button) findViewById(R.id.buttonClr);
        txtResult = (TextView) findViewById(R.id.txtResult);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    txtResult.setText(Double.toString(num1 + num2));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter values in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    txtResult.setText(Double.toString(num1 - num2));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter values in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    txtResult.setText(Double.toString(num1 / num2));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter values in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());
                    txtResult.setText(Double.toString(num1 * num2));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter values in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
