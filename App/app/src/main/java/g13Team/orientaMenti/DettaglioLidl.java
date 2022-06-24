package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class DettaglioLidl extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_lidl);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(DettaglioLidl.this, ListaAziende.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(DettaglioLidl.this, DashboardStudente.class);
        startActivity(home);
    }
}