package com.example.mainactivitysend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    Button btnback;
    EditText edtmsv,edttsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        btnback = findViewById(R.id.btnback);
        edtmsv = findViewById(R.id.edtMSV);
        edttsv = findViewById(R.id.edtTSV);
        Intent intent = getIntent();
        SinhVien s = (SinhVien) intent.getSerializableExtra("SINHVIEN");
        String ma = s.getMa();
        String ten = s.getTen();

        edtmsv.setText(ma);
        edttsv.setText(ten);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}