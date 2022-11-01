package com.pab.uts_nabilasyiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNamle, etNoDaftar;
    private Spinner spJalur;
    private CheckBox cbKon;
    private Button btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamle = findViewById(R.id.et_namle);
        etNoDaftar = findViewById(R.id.et_no_daftar);
        spJalur = findViewById(R.id.sp_jalur);
        cbKon = findViewById(R.id.cb_kon);
        btnReg = findViewById(R.id.btn_reg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaLen, noDaftar, jalurDaf;

                namaLen = etNamle.getText().toString();
                noDaftar = etNoDaftar.getText().toString();
                jalurDaf = spJalur.getSelectedItem().toString();

                if(namaLen.trim().equals("")){
                    etNamle.setError("Nama perlu diisi!");
                }

                else if(noDaftar.trim().equals("")){
                    etNoDaftar.setError("Nomor pendaftaran perlu diisi!");
                }

                else if(jalurDaf.equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Jalur pendaftaran perlu dipilih!", Toast.LENGTH_SHORT).show();
                }

                else if(cbKon.isChecked() == false){
                    Toast.makeText(MainActivity.this, "Cetang konfirmasi terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent chg = new Intent(MainActivity.this, ResActivity.class);
                    chg.putExtra("vNama", namaLen);
                    chg.putExtra("vNoDaftar", noDaftar);
                    chg.putExtra("vJalur", jalurDaf);
                    startActivity(chg);
                }
            }
        });
    }
}