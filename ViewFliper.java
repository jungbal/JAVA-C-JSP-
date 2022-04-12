package com.cookandroid.project6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    Button[] btnArr = new Button[4];
    Integer[] btnId = {R.id.btnStart, R.id.btnBack, R.id.btnNext, R.id.btnStop};
    ViewFlipper viewFlip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        viewFlip = findViewById(R.id.viewFlip);
        for(int i=0; i<btnArr.length; i++){
            btnArr[i] = findViewById(btnId[i]);
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(view.getId()){
                        case R.id.btnStart:
                            viewFlip.setFlipInterval(200);
                            viewFlip.startFlipping();
                            break;
                        case R.id.btnBack:
                            viewFlip.showPrevious();
                            break;
                        case R.id.btnNext:
                            viewFlip.showPrevious();
                            break;
                        case R.id.btnStop:
                            viewFlip.stopFlipping();
                            break;
                    }
                }
            });
        }
    }
}
