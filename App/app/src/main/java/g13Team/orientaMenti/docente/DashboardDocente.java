package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocenteHR;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.ListaAziende;

public class DashboardDocente extends MenuDocenteHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_docente);

        super.create(this);
    }

    public void listaStudenti(View view){
        Intent intent = new Intent(DashboardDocente.this, ListaStudentiDocente.class);
        startActivity(intent);
    }
}