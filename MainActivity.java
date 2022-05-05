package com.cookandroid.project7_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtName, txtEmail, toastTxt, dlgTxtId;
    EditText dlgEdName, dlgEdEmail, edId;
    Button btn;
    View dlgView, toastView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        btn = findViewById(R.id.btn);
        edId = findViewById(R.id.edId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dlgView = View.inflate(MainActivity.this, R.layout.dialog1, null);
                dlgTxtId = dlgView.findViewById(R.id.dlgTxtId);
                dlgTxtId.setText(edId.getText().toString());

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(dlgView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dlgEdName = dlgView.findViewById(R.id.dlgEdName);
                        dlgEdEmail = dlgView.findViewById(R.id.dlgEdEmail);
                        txtName.setText(dlgEdName.getText().toString());
                        txtEmail.setText(dlgEdEmail.getText().toString());

                    }
                });
                dlg.setPositiveButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "입력 취소", Toast.LENGTH_SHORT).show();
                    }
                });
                dlg.show();
            }
        });
    }
}