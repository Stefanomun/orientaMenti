package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.docente.ListaStudentiDocente;

public class Questionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);
    }

    public void indietro(View view){
        Intent intent = new Intent(Questionario.this, ListaStudentiDocente.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(Questionario.this, DashboardDocente.class);
        startActivity(intent);
    }

    public void conferma(View view){
        Intent intent = new Intent(Questionario.this, ConfermaQuestionario.class);
        startActivity(intent);
    }
}