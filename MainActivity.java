package com.cookandroid.project7_1_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText txtRotate;
    ImageView img;
    int ang = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        txtRotate = findViewById(R.id.txtRotate);
        img = findViewById(R.id.img);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btnRotate:
                ang = Integer.parseInt(txtRotate.getText().toString());
                img.setRotation(ang);
                break;
            case R.id.itemimg1:
                img.setImageResource(R.drawable.jeju14);
                break;
            case R.id.itemimg2:
                img.setImageResource(R.drawable.jeju6);
                break;
            case R.id.itemimg3:
                img.setImageResource(R.drawable.jeju15);
                break;

        }
        return false;
    }
}