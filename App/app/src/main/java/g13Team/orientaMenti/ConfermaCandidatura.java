package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoConsulenteAziendale;
import g13Team.orientaMenti.studente.DashboardStudente;

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
        Intent intent = new Intent(ConfermaCandidatura.this, DashboardStudente.class);
        Toast.makeText(getApplicationContext(), "La tua candidatura è stata inviata con successo!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}