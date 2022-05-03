package com.cookandroid.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button btnColor, btnChange, btnYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        baseLayout = findViewById(R.id.baseLayout);
        btnColor = findViewById(R.id.btnColor);
        btnChange = findViewById(R.id.btnChange);
        btnYear = findViewById(R.id.btnYear);

        registerForContextMenu(btnColor);
        registerForContextMenu(btnChange);

        btnYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu p = new PopupMenu(getApplicationContext(), view);
                getMenuInflater().inflate(R.menu.menu3, p.getMenu());
                p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId()){
                            case R.id.item1:
                                Toast.makeText(getApplicationContext(), "1학년 선택", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.item2:
                                Toast.makeText(getApplicationContext(), "2학년 선택", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.item3:
                                Toast.makeText(getApplicationContext(), "3학년 선택", Toast.LENGTH_SHORT).show();
                                return true;
                        }
                        return false;
                    }
                });
                p.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater m = getMenuInflater();
        if(v == btnColor){
            menu.setHeaderTitle("배경색 변경");
            m.inflate(R.menu.menu1, menu);
        }
        if(v == btnChange)m.inflate(R.menu.menu2, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.itemGreen: baseLayout.setBackgroundColor(Color.GREEN); return true;
            case R.id.itemWhite: baseLayout.setBackgroundColor(Color.WHITE); return true;
            case R.id.itemRotate: btnChange.setRotation(45); return true;
            case R.id.itemReturn: btnChange.setRotation(0); return true;
        }
        return false;
    }
}
