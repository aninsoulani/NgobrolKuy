package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void lupapw(View view) {
        Intent pindah = new Intent(this, LupaActivity.class);
        startActivity(pindah);
    }

    public void login(View view) {
        Intent login = new Intent(LoginActivity.this, ProfilePicActivity.class);
        startActivity(login);
    }
}