package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.Questionario;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocente;

public class ListaStudentiDocente extends MenuDocente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_docente);
    }

    public void questionario(View view){
        Intent intent = new Intent(ListaStudentiDocente.this, Questionario.class);
        startActivity(intent);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }
}