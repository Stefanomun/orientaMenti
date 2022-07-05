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
}
