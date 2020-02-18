package com.example.tpm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.GestureDescription;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Third_activity extends AppCompatActivity {
    EditText etPanjang, etLebar;
    Button btHitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);

        etPanjang=findViewById(R.id.etPanjang);
        etLebar=findViewById(R.id.etLebar);
        btHitung=findViewById(R.id.btnHitung);
        tvHasil=findViewById(R.id.tvHasil);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Lebar=Double.parseDouble(etLebar.getText().toString());
                Double Panjang=Double.parseDouble(etPanjang.getText().toString());
                Double Hasil=Lebar*Panjang;

                String Hsl= String.valueOf(Hasil);

                tvHasil.setText(Hsl);
            }
        });
    }
}
