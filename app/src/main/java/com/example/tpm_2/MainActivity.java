package com.example.tpm_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btKirim;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btKirim=findViewById(R.id.btKirim);
        etNama=findViewById(R.id.etNama);

        btKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();

                String str = etNama.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Second_activity.class);
                bundle.putString("stuff", str);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
