package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.docente.ListaStudentiDocente;
import g13Team.orientaMenti.studente.DashboardStudente;

public class ConfermaQuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conferma_questionario);
    }

    public void no(View view){
        Intent intent = new Intent(ConfermaQuestionario.this, ListaStudentiDocente.class);
        startActivity(intent);
    }

    public void si(View view){
        AlertDialog.Builder builder= new AlertDialog.Builder(ConfermaQuestionario.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.activity_questionario_inviato, null);
        builder.setView(customLayout);
        Button ok= customLayout.findViewById(R.id.btn_dialog);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), DashboardDocente.class);
                startActivity(in);
            }
        });
        builder.show();
    }
}