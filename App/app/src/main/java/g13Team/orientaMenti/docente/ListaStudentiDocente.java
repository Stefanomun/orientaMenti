package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

import g13Team.orientaMenti.Questionario;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;
import g13Team.orientaMenti.menu.MenuDocente;

public class ListaStudentiDocente extends MenuDocente {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_docente);
        super.create(this);

        toolbar = (Toolbar) findViewById(R.id.filtri);
        setSupportActionBar(toolbar);
    }

    public void filtri(View view) {
        toolbar.showOverflowMenu();
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        toolbar.inflateMenu(R.menu.filtro_studenti_docenti);
        super.toolbar.inflateMenu(R.menu.menu_docente_hr);
        return true;
    }

    public void questionario(View view) {
        int layout = view.getId();
        String card = view.findViewById(layout).toString();
        Intent intent = new Intent(ListaStudentiDocente.this, Questionario.class);

        if (card.contains("id/card1"))
            intent.putExtra("nome", "Marta Rossi");
        else if (card.contains("id/card2"))
            intent.putExtra("nome", "Alberto Fontana");
        else if (card.contains("id/card3"))
            intent.putExtra("nome", "Roberta Russo");
        else if (card.contains("id/card4"))
            intent.putExtra("nome", "Luigi De Luca");
        else if (card.contains("id/card5"))
            intent.putExtra("nome", "Veronica Vespa");

        startActivity(intent);
    }

    public void indietro(View view) {
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profilo:
                Intent profilo = new Intent(getApplicationContext(), ProfiloDocente.class);
                startActivity(profilo);
                break;

            case R.id.logout:
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                break;

            case R.id.classe5A:
                filtra("Classe5A");
                break;

            case R.id.classe5B:
                filtra("Classe5B");
                break;
        }
        return true;
    }

    private void filtra(String citta) {
        setContentView(R.layout.activity_lista_studenti_docente);
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