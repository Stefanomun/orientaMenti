package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoProjectManager;
import g13Team.orientaMenti.studente.BandoSoftwareDeveloper;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.DettaglioMeta;

public class ListaBandiAzienda1 extends MenuStudente {

    private boolean indietroAlternativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_azienda1);
        super.create(this);
        indietroAlternativo = getIntent().getBooleanExtra("indietroAlternativo", true);
    }

    public void indietro(View view) {
        if (indietroAlternativo)
            startActivity(new Intent(ListaBandiAzienda1.this, ListaBandi.class));
        else
            startActivity(new Intent(ListaBandiAzienda1.this, DettaglioMeta.class));
    }

    public void home(View view) {
        Intent home = new Intent(ListaBandiAzienda1.this, DashboardStudente.class);
        startActivity(home);
    }

    public void bando1(View view) {
        Intent home = new Intent(ListaBandiAzienda1.this, BandoSoftwareDeveloper.class);
        home.putExtra("bando", "meta");
        startActivity(home);
    }

    public void bando2(View view) {
        Intent home = new Intent(ListaBandiAzienda1.this, BandoProjectManager.class);
        home.putExtra("bando", "meta");
        startActivity(home);
    }
}