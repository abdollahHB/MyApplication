package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText nomprenom;
    private EditText email;
    private EditText phone;
    private EditText adresse;
    private Spinner villes;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nomprenom = findViewById(R.id.nomprenom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        villes = findViewById(R.id.villes);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomPrenom = nomprenom.getText().toString();
                String emailText = email.getText().toString();
                String phoneText = phone.getText().toString();
                String adresseText = adresse.getText().toString();
                String ville = villes.getSelectedItem().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nomPrenom", nomPrenom);
                intent.putExtra("email", emailText);
                intent.putExtra("phone", phoneText);
                intent.putExtra("adresse", adresseText);
                intent.putExtra("ville", ville);
                startActivity(intent);
            }
        });
    }
}
