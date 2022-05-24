package com.cookandroid.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtAge;
    CheckBox chkGame, chkMusic, chkExc;
    Button btn;
    ArrayList<String> hobbyList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원[Intent실습2]");
        edtName = findViewById(R.id.edtName);
        edtAge = findViewById(R.id.edtAge);
        chkGame = findViewById(R.id.chkGame);
        chkMusic = findViewById(R.id.chkMusic);
        chkExc = findViewById(R.id.chkExc);
        btn = findViewById(R.id.btn);
        edtName.getText().toString();
        edtAge.getText().toString();

        chkGame.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    hobbyList.add(chkGame.getText().toString());
                }
                else hobbyList.remove(hobbyList.indexOf(chkGame.getText().toString()));
            }
        });
        chkMusic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    hobbyList.add(chkMusic.getText().toString());
                }
                else hobbyList.remove(hobbyList.indexOf(chkMusic.getText().toString()));
            }
        });
        chkExc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    hobbyList.add(chkExc.getText().toString());
                }
                else hobbyList.remove(hobbyList.indexOf(chkExc.getText().toString()));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                int age = Integer.parseInt(edtAge.getText().toString());

                Intent in = new Intent(getApplicationContext(), SecondActivity.class);
                in.putExtra("name", name);
                in.putExtra("age", age);
                in.putExtra("hobby", hobbyList);
                startActivity(in);

            }
        });


    }
}
