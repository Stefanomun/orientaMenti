package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoConsulenteAziendale;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.DettaglioIntesa;

public class ListaBandiAzienda3 extends MenuStudente {

    private boolean indietroAlternativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_azienda3);
        super.create(this);
        indietroAlternativo = getIntent().getBooleanExtra("indietroAlternativo", true);
    }

    public void indietro(View view) {
        if (indietroAlternativo)
            startActivity(new Intent(ListaBandiAzienda3.this, ListaBandi.class));
        else
            startActivity(new Intent(ListaBandiAzienda3.this, DettaglioIntesa.class));
    }

    public void home(View view) {
        Intent home = new Intent(ListaBandiAzienda3.this, DashboardStudente.class);
        startActivity(home);
    }

    public void bando1(View view) {
        Intent home = new Intent(ListaBandiAzienda3.this, BandoConsulenteAziendale.class);
        home.putExtra("bando", "intesa");
        startActivity(home);
    }
}