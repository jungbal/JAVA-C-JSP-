package com.cookandroid.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView txtName, txtAge, txtHobby;
    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        txtHobby = findViewById(R.id.txtHobby);
        btnSecond = findViewById(R.id.btnSecond);

        Intent in = getIntent();
        String name = in.getStringExtra("name");
        int age = in.getIntExtra("age", 0);
        ArrayList<String> hobbyList = in.getStringArrayListExtra("hobby");
        txtName.setText("이름: "+name);
        txtAge.setText("나이: "+age);

        String hobby="";
        for(int i=0; i<hobbyList.size(); i++){
            hobby += hobbyList.get(i) + " ";
            txtHobby.setText("취미: "+hobby);
            btnSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }
    }
}
