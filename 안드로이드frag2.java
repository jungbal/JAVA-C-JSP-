package com.cookandroid.project6_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag2 extends Fragment {
    Button btnFrag2, btnSum;
    EditText edtX, edtY;
    TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.frag2, container,false);
        btnFrag2 = v.findViewById(R.id.btnFrag2);
        btnSum = v.findViewById(R.id.btnSum);
        edtX = v.findViewById(R.id.edtX);
        edtY = v.findViewById(R.id.edtY);
        txtResult = v.findViewById(R.id.txtResult);
        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "두번째 TabFragment", Toast.LENGTH_SHORT).show();
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edtX.getText().toString());
                int y = Integer.parseInt(edtY.getText().toString());
                txtResult.setText(""+(x+y));
            }
        });
        return v;
    }
}
