package com.pab.uts_nabilasyiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResActivity extends AppCompatActivity {
    private TextView tvNalen, tvNoPen, tvJalurD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        tvNalen = findViewById(R.id.tv_nalen);
        tvNoPen = findViewById(R.id.tv_nopen);
        tvJalurD = findViewById(R.id.tv_jalurd);

        Intent chg = getIntent();
        tvNalen.setText(chg.getStringExtra("vNama"));
        tvNoPen.setText(chg.getStringExtra("vNoDaftar"));
        tvJalurD.setText(chg.getStringExtra("vJalur"));
    }
}