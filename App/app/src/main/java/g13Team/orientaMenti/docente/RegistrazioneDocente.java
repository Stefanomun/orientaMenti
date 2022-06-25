package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;

public class RegistrazioneDocente extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_docente);
    }

    public void indietro(View v) {
        Intent in = new Intent(getApplicationContext(), Login.class);
        startActivity(in);
    }

    public void regDoc(View v) {
        Intent in = new Intent(getApplicationContext(), Login.class);
        startActivity(in);
    }
}