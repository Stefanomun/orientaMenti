package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ListaBandiAzienda3;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class DettaglioIntesa extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_intesa);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(DettaglioIntesa.this, ListaAziende.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(DettaglioIntesa.this, DashboardStudente.class);
        startActivity(home);
    }

    public void bandi(View view){
        Intent intent = new Intent(DettaglioIntesa.this, ListaBandiAzienda3.class);
        startActivity(intent);
    }
}