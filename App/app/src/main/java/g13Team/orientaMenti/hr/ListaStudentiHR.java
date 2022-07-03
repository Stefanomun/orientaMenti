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

    public void studente2(View v){
        Intent student2= new Intent(getApplicationContext(), ContattoStudente2.class);
        startActivity(student2);
    }

    public void studente3(View v){
        Intent student3= new Intent(getApplicationContext(), ContattoStudente3.class);
        startActivity(student3);
    }
    public void studente4(View v){
        Intent student4= new Intent(getApplicationContext(), ContattoStudente4.class);
        startActivity(student4);
    }

    public void studente5(View v){
        Intent student5= new Intent(getApplicationContext(), ContattoStudente5.class);
        startActivity(student5);
    }

    public void studente6(View v){
        Intent student6= new Intent(getApplicationContext(), ContattoStudente6.class);
        startActivity(student6);
    }

    public void studente7(View v){
        Intent student7= new Intent(getApplicationContext(), ContattoStudente7.class);
        startActivity(student7);
    }

}