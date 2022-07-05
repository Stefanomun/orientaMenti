package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class DettaglioBando2 extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_bando2);
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

    public void studente4(View v){
        Intent goStudente4= new Intent(getApplicationContext(), ContattoStudente4.class);
        startActivity(goStudente4);
    }

    public void studente5(View v){
        Intent goStudente5= new Intent (getApplicationContext(), ContattoStudente5.class);
        startActivity(goStudente5);
    }

    public void studente6(View v){
        Intent goStudente6= new Intent (getApplicationContext(), ContattoStudente6.class);
        startActivity(goStudente6);
    }

    public void chiudi(View v){
        Intent chiudi= new Intent(getApplicationContext(), ListaBandiHR.class);
        startActivity(chiudi);
    }

}
