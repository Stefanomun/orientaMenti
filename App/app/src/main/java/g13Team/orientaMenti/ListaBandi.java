package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import g13Team.orientaMenti.login.Login;
import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.BandoConsulenteAziendale;
import g13Team.orientaMenti.studente.BandoCrewMember;
import g13Team.orientaMenti.studente.BandoProjectManager;
import g13Team.orientaMenti.studente.BandoSoftwareDeveloper;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.Messaggi;
import g13Team.orientaMenti.studente.ProfiloStudente;

public class ListaBandi extends MenuStudente {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi);

        toolbar = (Toolbar) findViewById(R.id.filtri);
        setSupportActionBar(toolbar);

        super.create(this);
    }

    public void filtri(View view) {
        toolbar.showOverflowMenu();
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

    public void bando2(View view){
        Intent intent = new Intent(this, BandoProjectManager.class);
        startActivity(intent);
    }

    public void bando3(View view){
        Intent intent = new Intent(this, BandoCrewMember.class);
        startActivity(intent);
    }

    public void bando4(View view){
        Intent intent = new Intent(this, BandoConsulenteAziendale.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        toolbar.inflateMenu(R.menu.filtro_bandi);
        super.toolbar.inflateMenu(R.menu.menu_studente);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.messaggi:
                Intent messaggi = new Intent(this, Messaggi.class);
                startActivity(messaggi);
                Toast.makeText(menu, "Messaggi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profilo:
                Intent profilo = new Intent(getApplicationContext(), ProfiloStudente.class);
                startActivity(profilo);
                Toast.makeText(menu, "Profilo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                startActivity(new Intent(this, Login.class));
                break;

            case R.id.meta:
                startActivity(new Intent(this, ListaBandiAzienda1.class));
                break;

            case R.id.lidl:
                startActivity(new Intent(this, ListaBandiAzienda2.class));
                break;

            case R.id.intesa:
                startActivity(new Intent(this, ListaBandiAzienda3.class));
                break;
        }
        return true;
    }
}