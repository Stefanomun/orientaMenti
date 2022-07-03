package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class DashboardStudente extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_studente);

        super.create(this);
    }

    public void listaAziende(View view) {
        Intent intent = new Intent(DashboardStudente.this, ListaAziende.class);
        startActivity(intent);
    }

    public void listaBandi(View view) {
        Intent intent = new Intent(DashboardStudente.this, ListaBandi.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

    }
}