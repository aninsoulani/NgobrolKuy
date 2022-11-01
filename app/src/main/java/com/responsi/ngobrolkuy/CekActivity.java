package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CekActivity extends AppCompatActivity {
    private ImageButton balikk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);
        balikk = findViewById(R.id.backbalik);
        balikk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balikk = new Intent(CekActivity.this, LoginActivity.class);
                startActivity(balikk);
            }
        });
    }

    public void kembali(View view) {
        Intent balik = new Intent(CekActivity.this, LoginActivity.class);
        startActivity(balik);
    }
}