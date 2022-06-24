package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaAziende extends MenuStudente {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aziende);

        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(ListaAziende.this, DashboardStudente.class);
        startActivity(indietro);
    }

    public void meta(View view){
        Intent meta = new Intent(ListaAziende.this, DettaglioMeta.class);
        startActivity(meta);
    }

    public void intesa(View view){
        Intent intesa = new Intent(ListaAziende.this, DettaglioIntesa.class);
        startActivity(intesa);
    }

    public void lidl(View view){
        Intent lidl = new Intent(ListaAziende.this, DettaglioLidl.class);
        startActivity(lidl);
    }

    public void oracle(View view){
        Intent oracle = new Intent(ListaAziende.this, DettaglioOracle.class);
        startActivity(oracle);
    }

    public void home(View view){
        Intent home = new Intent(ListaAziende.this, DashboardStudente.class);
        startActivity(home);
    }
}