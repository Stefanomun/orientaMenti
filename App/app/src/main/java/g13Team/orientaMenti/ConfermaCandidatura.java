package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoConsulenteAziendale;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.RegistrazioneStudente;

public class ConfermaCandidatura extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conferma_candidatura);
        super.create(this);
    }

    public void no(View view){
        Intent intent = new Intent(ConfermaCandidatura.this, ListaBandi.class);
        startActivity(intent);
    }

    public void si(View view){
        AlertDialog.Builder builder= new AlertDialog.Builder(ConfermaCandidatura.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.activity_candidatura_effettuata, null);
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