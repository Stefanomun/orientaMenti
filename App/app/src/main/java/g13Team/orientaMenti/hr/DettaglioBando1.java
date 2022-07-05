package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class DettaglioBando1 extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_bando1);
        super.create(this);
    }

    public void indietro (View v){
        Intent in= new Intent(getApplicationContext(), ListaBandiHR.class);
        startActivity(in);
    }

    public void home(View v){
        Intent in= new Intent(getApplicationContext(), DashboardHR.class);
        startActivity(in);
    }

    public void studente1(View v){
        Intent goStudente1= new Intent(getApplicationContext(), ContattoStudente1.class);
        startActivity(goStudente1);
    }

    public void studente2(View v){
        Intent goStudente2= new Intent (getApplicationContext(), ContattoStudente2.class);
        startActivity(goStudente2);
    }

    public void chiudi(View v){
        Intent chiudi= new Intent(getApplicationContext(), ListaBandiHR.class);
        startActivity(chiudi);
    }
}
