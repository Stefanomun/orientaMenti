package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class ListaStudentiHR extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_hr);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaStudentiHR.this, DashboardHR.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent in= new Intent (getApplicationContext(), DashboardHR.class);
        startActivity(in);
    }

    public void studente1(View v){
        Intent student1= new Intent(getApplicationContext(), ContattoStudente1.class);
        startActivity(student1);
    }

}