package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.DettaglioIntesa;
import g13Team.orientaMenti.studente.DettaglioOracle;
import g13Team.orientaMenti.studente.ListaAziende;

public class ListaBandiAzienda4 extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_azienda4);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(ListaBandiAzienda4.this, DettaglioOracle.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(ListaBandiAzienda4.this, DashboardStudente.class);
        startActivity(home);
    }
}