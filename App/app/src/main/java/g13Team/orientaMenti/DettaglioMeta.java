package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DettaglioMeta extends MenuStudente {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_meta);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(DettaglioMeta.this, ListaAziende.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(DettaglioMeta.this, DashboardStudente.class);
        startActivity(home);
    }

}