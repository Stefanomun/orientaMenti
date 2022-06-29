package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ListaBandiAzienda2;
import g13Team.orientaMenti.ListaBandiAzienda3;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class DettaglioLidl extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_lidl);

        super.create(this);
    }

    public void indietro(View view){
        Intent intent = new Intent(DettaglioLidl.this, ListaAziende.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(DettaglioLidl.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void bandi(View view){
        Intent intent = new Intent(DettaglioLidl.this, ListaBandiAzienda2.class);
        startActivity(intent);
    }
}