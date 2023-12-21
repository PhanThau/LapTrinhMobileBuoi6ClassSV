package com.example.mainactivitysend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnnext;
    EditText edtma,edtten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnext=findViewById(R.id.btnnext);
        edtma = findViewById(R.id.edtMaSV);
        edtten=findViewById(R.id.edtTenSV);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                SinhVien s = new SinhVien(edtma.getText().toString(),edtten.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putSerializable("SINHVIEN",s);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}