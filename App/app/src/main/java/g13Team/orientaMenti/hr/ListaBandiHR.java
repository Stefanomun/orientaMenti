package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.Chat;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;
import g13Team.orientaMenti.studente.DashboardStudente;

public class ListaBandiHR extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_hr);
        super.create(this);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaBandiHR.this, DashboardHR.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(ListaBandiHR.this, DashboardHR.class);
        startActivity(intent);
    }

    public void aggiungiBando(View view){
        Intent intent = new Intent(ListaBandiHR.this, NuovoBando.class);
        startActivity(intent);
    }

    public void bando1(View v){
        Intent in = new Intent(ListaBandiHR.this, DettaglioBando1.class);
        startActivity(in);
    }

    public void bando2(View v){
        Intent in= new Intent(ListaBandiHR.this, DettaglioBando2.class);
        startActivity(in);
    }
}