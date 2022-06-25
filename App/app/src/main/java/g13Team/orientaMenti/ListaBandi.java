package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoSoftwareDeveloper;
import g13Team.orientaMenti.studente.DashboardStudente;

public class ListaBandi extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi);

        super.create(this);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaBandi.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(ListaBandi.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void bando1(View view){
        Intent intent = new Intent(this, BandoSoftwareDeveloper.class);
        startActivity(intent);
    }

}