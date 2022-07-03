package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoCrewMember;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.DettaglioIntesa;
import g13Team.orientaMenti.studente.DettaglioLidl;
import g13Team.orientaMenti.studente.ListaAziende;

public class ListaBandiAzienda2 extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_azienda2);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(ListaBandiAzienda2.this, DettaglioLidl.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(ListaBandiAzienda2.this, DashboardStudente.class);
        startActivity(home);
    }

    public void bando1(View view){
        Intent home = new Intent(ListaBandiAzienda2.this, BandoCrewMember.class);
        home.putExtra("bando", "lidl");
        startActivity(home);
    }
}