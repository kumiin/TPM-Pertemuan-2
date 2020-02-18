package com.example.tpm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    TextView tvNama;
    Button btOperasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        String hi="Hai ";
        tvNama=(TextView)findViewById(R.id.tvNama);
        btOperasi=findViewById(R.id.btOperasi);
        Bundle bundle = getIntent().getExtras();
        String varS= bundle.getString("stuff");
        varS=hi+varS;
        tvNama.setText(varS);

        btOperasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Third_activity.class);
                startActivity(i);
            }
        });
    }
}
