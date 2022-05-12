package com.cookandroid.project8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker1;
    EditText edtDiary;
    Button btnWrite;
    String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        datePicker1 = findViewById(R.id.datePicker1);
        edtDiary = findViewById(R.id.edtDiary);
        btnWrite = findViewById(R.id.btnWrite);

        Calendar cal = Calendar.getInstance();
        int cYear = cal.get(Calendar.YEAR);
        int cMonth = cal.get(Calendar.MONTH);
        int cDay = cal.get(Calendar.DAY_OF_MONTH);

        datePicker1.init(cYear, cMonth, cDay, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                fileName = Integer.toString(year)+"_"+Integer.toString(month+1)
                        +"_"+Integer.toString(day);
                String str = readDiary(fileName);
                edtDiary.setText(str);
                btnWrite.setEnabled(true);
            }
        });
        dateInit(cYear, cMonth, cDay);
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = edtDiary.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), fileName+"이 저장됨", Toast.LENGTH_SHORT).show();
                }catch(IOException e){ }
            }
        });
    }
    void dateInit(int y, int m, int d){
        fileName = Integer.toString(y)+"_"+Integer.toString(m+1)
                +"_"+Integer.toString(d);
        String str = readDiary(fileName);
        edtDiary.setText(str);
        btnWrite.setEnabled(true);
    }
    String readDiary(String fineName){
        String dStr = null;
        FileInputStream inFs;
        try{
            inFs = openFileInput(fineName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            inFs.close();
            dStr = (new String(txt)).trim();
            btnWrite.setText("수정하기");
        }catch(IOException e){
            edtDiary.setHint("일기 없음");
            btnWrite.setText("새로 저장");
        }
        return dStr;
    }
}