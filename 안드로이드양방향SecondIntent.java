package com.cookandroid.project10_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("이정원[두번째 화면]");
        btnReturn = findViewById(R.id.btnReturn);

        Intent in = getIntent();
        int x = in.getIntExtra("x", 0);
        int y = in.getIntExtra("y", 0);
        int result = x+y;
        Toast.makeText(getApplicationContext(),""+result, Toast.LENGTH_SHORT).show();
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent out = new Intent(getApplicationContext(), MainActivity.class);
                out.putExtra("result", result);
                setResult(RESULT_OK,out);
                finish();
            }
        });

    }
}
