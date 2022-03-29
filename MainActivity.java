package com.cookandroid.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtResult;
    String num1, num2;
    Integer result;
    int i;
    Button[] btnArr = new Button[10];
    Integer[] btnIds = {R.id.btnNum0, R.id.btnNum1, R.id.btnNum2, R.id.btnNum3, R.id.btnNum4, R.id.btnNum5, R.id.btnNum6, R.id.btnNum6, R.id.btnNum7, R.id.btnNum8, R.id.btnNum9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        for(i=0; i<btnArr.length; i++){
            btnArr[i] = findViewById(btnIds[i]);
        }
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);
        for(i=0; i<btnArr.length; i++){
            final int index = i;
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edt1.isFocused()){
                        num1 = edt1.getText().toString();
                        num1 += btnArr[index].getText().toString();
                        edt1.setText(num1);
                    }
                    else if(edt2.isFocused()){
                        num2 = edt2.getText().toString();
                        num2 += btnArr[index].getText().toString();
                        edt2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(), "에디트부터 선택하세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }
    public void btnClick(View view){
        num1 = edt1.getText().toString();
        num2 = edt2.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                result = Integer.parseInt(num1)+Integer.parseInt(num2);
                break;
            case R.id.btnSub:
                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                break;
            case R.id.btnMul:
                result = Integer.parseInt(num1)*Integer.parseInt(num2);
                break;
            case R.id.btnDiv:
                result = Integer.parseInt(num1)/Integer.parseInt(num2);
                break;
        }
        txtResult.setText("계산결과:"+result);
    }
}