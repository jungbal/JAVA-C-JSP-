package com.cookandroid.project10_4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtX, edtY;
    Button btnSum;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원[반환값]");
        edtX = findViewById(R.id.edtX);
        edtY = findViewById(R.id.edtY);
        btnSum = findViewById(R.id.btnSum);
        txtResult = findViewById(R.id.txtResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in = new Intent(getApplicationContext(), SecondActivity.class);
                in.putExtra("x", Integer.parseInt(edtX.getText().toString()));
                in.putExtra("y", Integer.parseInt(edtY.getText().toString()));
                startActivityForResult(in, 0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            int result = data.getIntExtra("result", 0);
            txtResult.setText("결과: "+result);
        }
    }
}