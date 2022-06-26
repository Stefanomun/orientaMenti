package g13Team.orientaMenti.docente;

import android.os.Bundle;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocenteHR;

public class ListaStudentiDocente extends MenuDocenteHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_docente);
    }
}