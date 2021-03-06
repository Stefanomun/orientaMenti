package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ListaBandiAzienda1;
import g13Team.orientaMenti.ListaBandiAzienda3;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class DettaglioMeta extends MenuStudente {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_meta);

        super.create(this);
    }

    public void indietro(View view){
        Intent intent = new Intent(DettaglioMeta.this, ListaAziende.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(DettaglioMeta.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void bandi(View view){
        Intent intent = new Intent(DettaglioMeta.this, ListaBandiAzienda1.class);
        startActivity(intent);
    }

}