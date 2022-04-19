package com.cookandroid.project6_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag1 extends Fragment {
    Button btnFrag1;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View v = inflater.inflate(R.layout.frag1, container,false);
         btnFrag1 = v.findViewById(R.id.btnFrag1);
        txt = v.findViewById(R.id.txt);
        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString().equals("버튼 클릭 함"))
                    txt.setText("첫 번째 프래그먼트");
                else txt.setText("버튼 클릭 함");
            }
        });
         return v;
    }
}
