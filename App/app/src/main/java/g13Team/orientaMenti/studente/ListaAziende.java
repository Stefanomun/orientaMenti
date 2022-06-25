package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class ListaAziende extends MenuStudente {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aziende);

        super.create(this);
    }

    public void indietro(View view){
        startIntent(new Intent(ListaAziende.this, DashboardStudente.class));
    }

    public void meta(View view){
        startIntent(new Intent(ListaAziende.this, DettaglioMeta.class));
    }

    public void intesa(View view){
        startIntent(new Intent(ListaAziende.this, DettaglioIntesa.class));
    }

    public void lidl(View view){
        startIntent(new Intent(ListaAziende.this, DettaglioLidl.class));
    }

    public void oracle(View view){
        startIntent(new Intent(ListaAziende.this, DettaglioOracle.class));
    }

    public void home(View view){
        startIntent(new Intent(ListaAziende.this, DashboardStudente.class));
    }

    private void startIntent(Intent intent) {
        intent.setFlags(intent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        this.finish();
    }
}