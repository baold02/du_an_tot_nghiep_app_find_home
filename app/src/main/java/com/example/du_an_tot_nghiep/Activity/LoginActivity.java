package com.example.du_an_tot_nghiep.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.du_an_tot_nghiep.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void DangKy(View view) {
        Intent intent = new Intent(LoginActivity.this, singupActivity.class);
        startActivity(intent);
    }
}