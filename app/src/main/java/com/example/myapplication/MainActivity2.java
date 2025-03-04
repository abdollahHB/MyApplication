package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView nomprenom;
    private TextView email;
    private TextView phone;
    private TextView adresse;
    private TextView ville;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // Appliquer les marges pour les barres système
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialiser les vues
        nomprenom = findViewById(R.id.nomprenom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);

        // Récupérer les données de l'intent
        Intent intent = getIntent();
        String nomPrenom = intent.getStringExtra("nomPrenom");
        String emailText = intent.getStringExtra("email");
        String phoneText = intent.getStringExtra("phone");
        String adresseText = intent.getStringExtra("adresse");
        String villeText = intent.getStringExtra("ville");

        // Afficher les données dans les TextView
        nomprenom.setText(nomPrenom);
        email.setText(emailText);
        phone.setText(phoneText);
        adresse.setText(adresseText);
        ville.setText(villeText);
    }
}