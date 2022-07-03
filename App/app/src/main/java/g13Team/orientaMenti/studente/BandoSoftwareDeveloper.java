package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ConfermaCandidatura;
import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class BandoSoftwareDeveloper extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bando_software_developer);
        super.create(this);
    }

    public void indietro(View view) {
        Intent intent = new Intent(BandoSoftwareDeveloper.this, ListaBandi.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(BandoSoftwareDeveloper.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void candidatura(View view) {
        Intent intent = new Intent(BandoSoftwareDeveloper.this, ConfermaCandidatura.class);
        startActivity(intent);
    }
}