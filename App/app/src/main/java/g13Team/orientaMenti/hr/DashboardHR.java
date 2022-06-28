package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.docente.ListaStudentiDocente;
import g13Team.orientaMenti.menu.MenuDocenteHR;

public class DashboardHR extends MenuDocenteHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_hr);

        super.create(this);
    }

    public void listaStudenti(View view){
        Intent intent = new Intent(DashboardHR.this, ListaStudentiHR.class);
        startActivity(intent);
    }

    public void listaBandi(View view){
        Intent intent = new Intent(DashboardHR.this, ListaBandiHR.class);
        startActivity(intent);
    }
}