package TP.mobile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView Welcom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);

        Welcom = findViewById(R.id.welcom);

        String nom = getIntent().getStringExtra("name");
        String prenom = getIntent().getStringExtra("lastname");
        String mail = getIntent().getStringExtra("mymail");

        Welcom.setText(
                "Bienvenue " + nom + " " + prenom +", c'est la deuxième activité. " +"Vous serez bientôt contacté sur : " + mail
        );
    }
}