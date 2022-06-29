package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;

public class ProfiloStudente extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo_studente);
    }

    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(), DashboardStudente.class);
        startActivity(in);
    }

    public void save(View v){
        Intent save= new Intent(getApplicationContext(), DashboardStudente.class);
        startActivity(save);
        Toast.makeText(getApplicationContext(), "Salvataggio effettuato", Toast.LENGTH_SHORT).show();
    }
}
