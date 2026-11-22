package TP.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtnom, edtprenom, edtmail;
    Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnom = findViewById(R.id.nom);
        edtprenom = findViewById(R.id.prenom);
        edtmail = findViewById(R.id.mail);
        envoyer = findViewById(R.id.btnsend);

        envoyer.setOnClickListener(v -> {

            String nom = edtnom.getText().toString();
            String prenom = edtprenom.getText().toString();
            String mail = edtmail.getText().toString();

            Intent myintent = new Intent(
                    MainActivity.this,
                    WelcomeActivity.class
            );

            myintent.putExtra("name", nom);
            myintent.putExtra("lastname", prenom);
            myintent.putExtra("mymail", mail);

            startActivity(myintent);
        });
    }
}