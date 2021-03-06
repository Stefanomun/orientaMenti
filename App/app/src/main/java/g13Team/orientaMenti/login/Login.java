package g13Team.orientaMenti.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.docente.RegistrazioneDocente;
import g13Team.orientaMenti.hr.DashboardHR;
import g13Team.orientaMenti.hr.RegistrazioneHR;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.MainActivity;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.studente.RegistrazioneStudente;

public class Login extends AppCompatActivity {

    public String ruolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "ciao", Toast.LENGTH_SHORT);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
            ruolo = bundle.getString("ruolo", null);
    }

    public void indietro(View view){
        Intent intent = new Intent(Login.this, MainActivity.class);
        ruolo = null;
        startActivity(intent);
    }

    public void accesso(View view){
        EditText editEmail = (EditText) findViewById(R.id.mail);
        String email = editEmail.getText().toString();
        EditText editPassword = (EditText) findViewById(R.id.password);
        String password = editPassword.getText().toString();
        if(email.equals("marta.rossi@studenti.it") && password.equals("studente")){
            Intent accesso = new Intent(Login.this, DashboardStudente.class);
            startActivity(accesso);
        }
        else if(email.equals("paolo.bianchi@docenti.it") && password.equals("docente")){
            Intent intent = new Intent(Login.this, DashboardDocente.class);
            startActivity(intent);
        }
        else if(email.equals("marco.verdi@manager.it") && password.equals("manager")){
            Intent intent = new Intent(Login.this, DashboardHR.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(Login.this, LoginError.class);
            startActivity(intent);
        }
    }
    public void registrati(View v){
        Intent in = null;
        if(ruolo.equals("studente")){
            in= new Intent(getApplicationContext(), RegistrazioneStudente.class);
        } else if (ruolo.equals("docente")){
            in= new Intent(getApplicationContext(), RegistrazioneDocente.class);
        } else if (ruolo.equals("manager")){
            in= new Intent(getApplicationContext(), RegistrazioneHR.class);
        }
        startActivity(in);

    }
}