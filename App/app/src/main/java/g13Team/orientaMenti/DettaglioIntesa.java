package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DettaglioIntesa extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_intesa);
        super.create(this);
    }

    public void indietro(View view){
        Intent indietro = new Intent(DettaglioIntesa.this, ListaAziende.class);
        startActivity(indietro);
    }

    public void home(View view){
        Intent home = new Intent(DettaglioIntesa.this, DashboardStudente.class);
        startActivity(home);
    }
}