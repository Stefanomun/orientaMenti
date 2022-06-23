package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListaAziende extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aziende);
    }

    public void indietro(View view){
        Intent indietro = new Intent(ListaAziende.this, DashboardStudente.class);
        startActivity(indietro);
    }
}