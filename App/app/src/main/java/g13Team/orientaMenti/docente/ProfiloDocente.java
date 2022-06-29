package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.studente.DashboardStudente;

public class ProfiloDocente extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo_docente);
    }

    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(), DashboardDocente.class);
        startActivity(in);
    }

    public void save(View v){
        Intent save= new Intent(getApplicationContext(), DashboardDocente.class);
        startActivity(save);
        Toast.makeText(getApplicationContext(), "Salvataggio effettuato", Toast.LENGTH_SHORT).show();
    }
}
