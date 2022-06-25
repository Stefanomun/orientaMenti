package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class DettaglioOracle extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_oracle);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(DettaglioOracle.this, ListaAziende.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(DettaglioOracle.this, DashboardStudente.class);
        startActivity(home);
    }
}