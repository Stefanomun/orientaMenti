package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class ListaBandiHR extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi_hr);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaBandiHR.this, DashboardHR.class);
        startActivity(intent);
    }

    /*public void aggiungiBando(View view){

    }*/
}