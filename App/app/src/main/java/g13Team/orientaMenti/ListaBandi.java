package g13Team.orientaMenti;

import android.os.Bundle;

import g13Team.orientaMenti.menu.MenuStudente;

public class ListaBandi extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bandi);

        super.create(this);
    }
}