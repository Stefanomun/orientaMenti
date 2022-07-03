package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoCrewMember;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.DettaglioLidl;

public class ListaBandiAzienda2 extends MenuStudente {

    private boolean indietroAlternativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_azienda2);
        super.create(this);
        indietroAlternativo = getIntent().getBooleanExtra("indietroAlternativo", true);
    }

    public void indietro(View view) {
        if (indietroAlternativo)
            startActivity(new Intent(ListaBandiAzienda2.this, ListaBandi.class));
        else
            startActivity(new Intent(ListaBandiAzienda2.this, DettaglioLidl.class));
    }

    public void home(View view) {
        Intent home = new Intent(ListaBandiAzienda2.this, DashboardStudente.class);
        startActivity(home);
    }

    public void bando1(View view) {
        Intent home = new Intent(ListaBandiAzienda2.this, BandoCrewMember.class);
        home.putExtra("bando", "lidl");
        startActivity(home);
    }
}