package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edX, edY;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtResult;
    String strnum1, strnum2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        edX = findViewById(R.id.edX);
        edY = findViewById(R.id.edY);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strnum1 = edX.getText().toString();
                strnum2 = edY.getText().toString();
                result = Integer.parseInt(strnum1) + Integer.parseInt(strnum2);
                txtResult.setText("계산결과:"+result);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strnum1 = edX.getText().toString();
                strnum2 = edY.getText().toString();
                result = Integer.parseInt(strnum1) - Integer.parseInt(strnum2);
                txtResult.setText("계산결과:"+result);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strnum1 = edX.getText().toString();
                strnum2 = edY.getText().toString();
                result = Integer.parseInt(strnum1) * Integer.parseInt(strnum2);
                txtResult.setText("계산결과:"+result);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strnum1 = edX.getText().toString();
                strnum2 = edY.getText().toString();
                if(Integer.parseInt(strnum2)!=0){
                result = Integer.parseInt(strnum1) / Integer.parseInt(strnum2);
                txtResult.setText("계산결과:" + result);
                }else txtResult.setText("0으로 나누기 불가");
            }
        });
    }
}
