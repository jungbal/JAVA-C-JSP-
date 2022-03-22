package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtAni;
    RadioGroup rg;
    CheckBox chkStart;
    Button btnOK;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        txtAni = findViewById(R.id.txtAni);
        rg = findViewById(R.id.rg);
        btnOK = findViewById(R.id.btnOK);
        img = findViewById(R.id.img);
        chkStart = findViewById(R.id.chkStart);

        chkStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkStart.isChecked()==true){
                    txtAni.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else{
                    txtAni.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    rg.clearCheck();
                    img.setImageDrawable(null);
                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rdoDog:
                        img.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoCat:
                        img.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rdoFox:
                        img.setImageResource(R.drawable.fox);
                        break;
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "앱 종료합니다.", Toast.LENGTH_SHORT).show();
                        finish();//앱종료
                }

        });

    }
}
