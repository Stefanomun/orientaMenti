package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;
import g13Team.orientaMenti.menu.MenuHR;

public class ListaStudentiHR extends MenuHR {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_hr);
        super.create(this);

        toolbar = (Toolbar) findViewById(R.id.filtri);
        setSupportActionBar(toolbar);
    }

    public void filtri(View view) {
        toolbar.showOverflowMenu();
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        toolbar.inflateMenu(R.menu.filtro_studenti);
        super.toolbar.inflateMenu(R.menu.menu_docente_hr);
        return true;
    }

    public void indietro(View view) {
        Intent intent = new Intent(ListaStudentiHR.this, DashboardHR.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent in = new Intent(getApplicationContext(), DashboardHR.class);
        startActivity(in);
    }

    public void studente1(View v) {
        Intent student1 = new Intent(getApplicationContext(), ContattoStudente1.class);
        startActivity(student1);
    }

    public void studente2(View v) {
        Intent student2 = new Intent(getApplicationContext(), ContattoStudente2.class);
        startActivity(student2);
    }

    public void studente3(View v) {
        Intent student3 = new Intent(getApplicationContext(), ContattoStudente3.class);
        startActivity(student3);
    }

    public void studente4(View v) {
        Intent student4 = new Intent(getApplicationContext(), ContattoStudente4.class);
        startActivity(student4);
    }

    public void studente5(View v) {
        Intent student5 = new Intent(getApplicationContext(), ContattoStudente5.class);
        startActivity(student5);
    }

    public void studente6(View v) {
        Intent student6 = new Intent(getApplicationContext(), ContattoStudente6.class);
        startActivity(student6);
    }

    public void studente7(View v) {
        Intent student7 = new Intent(getApplicationContext(), ContattoStudente7.class);
        startActivity(student7);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profilo:
                Intent profilo = new Intent(getApplicationContext(), ProfiloHR.class);
                startActivity(profilo);
                break;

            case R.id.logout:
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                break;

            case R.id.fisciano:
                filtra("Fisciano");
                break;

            case R.id.salerno:
                filtra("Salerno");
                break;
        }
        return true;
    }

    private void filtra(String citta) {
        setContentView(R.layout.activity_lista_studenti_hr);
        super.create(this);
        toolbar = (Toolbar) findViewById(R.id.filtri);
        setSupportActionBar(toolbar);


        RelativeLayout listaStudenti = findViewById(R.id.listaStudenti);
        ArrayList<View> list = new ArrayList<>();
        View view = listaStudenti.findViewWithTag(citta);

        while (view != null) {
            list.add(view);
            listaStudenti.removeView(view);
            view = listaStudenti.findViewWithTag(citta);
        }
        listaStudenti.removeAllViews();

        list.forEach(listaStudenti::addView);

        listaStudenti.invalidate();
    }
}