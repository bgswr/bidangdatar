package com.andro.kalkbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText epanjang, ealas, ediameter, elebar, etinggi;
    Button btpersegi, btsegitiga, btlingkaran;
    TextView tvhasil, tvhasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epanjang=(EditText)findViewById(R.id.editTextPanjang);
        ealas=(EditText)findViewById(R.id.editTextAlas);
        ediameter=(EditText)findViewById(R.id.editTextDiameter);
        elebar=(EditText)findViewById(R.id.editTextLebar);
        etinggi=(EditText)findViewById(R.id.editTextTinggi);
        btpersegi=(Button) findViewById(R.id.buttonPersegi);
        btsegitiga=(Button) findViewById(R.id.buttonSegitiga);
        btlingkaran=(Button) findViewById(R.id.buttonLingkaran);
        tvhasil=(TextView)findViewById(R.id.textViewHasil2);
        tvhasil2=(TextView)findViewById(R.id.textViewHasil3);

        btpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil1, hasil2;
                bilangan1=Double.valueOf(epanjang.getText().toString().trim());
                bilangan2=Double.valueOf(elebar.getText().toString().trim());

                hasil1=bilangan1 * bilangan2;
                hasil2=2*(bilangan1 + bilangan2);
                String hasill = String.valueOf(hasil1);
                String hasilll = String.valueOf(hasil2);
                tvhasil.setText(hasill);
                tvhasil2.setText(hasilll);
            }
        });

        btsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, bilangan2, hasil1, hasil2;
                bilangan1=Double.valueOf(ealas.getText().toString().trim());
                bilangan2=Double.valueOf(etinggi.getText().toString().trim());

                hasil1=0.5 * bilangan1 * bilangan2;
                hasil2=3 * bilangan1;
                String hasill = String.valueOf(hasil1);
                String hasilll = String.valueOf(hasil2);
                tvhasil.setText(hasill);
                tvhasil2.setText(hasilll);
            }
        });

        btlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1, hasil1, hasil2;
                bilangan1=Double.valueOf(ediameter.getText().toString().trim());


                hasil1=3.14 * ((0.5 * bilangan1)*(0.5 * bilangan1));
                hasil2=2 * 3.14 * (0.5 * bilangan1);
                String hasill = String.valueOf(hasil1);
                String hasilll = String.valueOf(hasil2);
                tvhasil.setText(hasill);
                tvhasil2.setText(hasilll);
            }
        });

    }
}
