package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LupaActivity extends AppCompatActivity {
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);
        back = findViewById(R.id.backlupa);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(LupaActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
    }

    public void submit(View view) {
        Intent intent = new Intent(this, CekActivity.class);
        startActivity(intent);
    }
}