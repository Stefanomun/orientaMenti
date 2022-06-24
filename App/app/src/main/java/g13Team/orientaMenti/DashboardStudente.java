package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardStudente extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_studente);

        super.create(this);
    }

    public void listaAziende(View view){
        Intent lista = new Intent(DashboardStudente.this, ListaAziende.class);
        startActivity(lista);
    }
}