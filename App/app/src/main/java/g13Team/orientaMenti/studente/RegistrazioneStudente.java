package g13Team.orientaMenti.studente;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;

public class RegistrazioneStudente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_studente);
    }
    public void indietro(View v){
        Intent in = new Intent(RegistrazioneStudente.this, Login.class);
        startActivity(in);
    }
    public void regStudente(View v){
         AlertDialog.Builder builder= new AlertDialog.Builder(RegistrazioneStudente.this);
           final View customLayout= getLayoutInflater().inflate(R.layout.custom_alert_dialog, null);
           builder.setView(customLayout);
           Button ok= customLayout.findViewById(R.id.btn_dialog);
            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(getApplicationContext(), DashboardStudente.class);
                    startActivity(in);
                }
            });
         builder.show();
    }
}
