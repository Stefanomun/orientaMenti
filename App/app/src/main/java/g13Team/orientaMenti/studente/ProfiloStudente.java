package g13Team.orientaMenti.studente;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.ConfermaQuestionario;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.docente.DashboardDocente;

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
        AlertDialog.Builder builder= new AlertDialog.Builder(ProfiloStudente.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.activity_conferma_salvataggio, null);
        builder.setView(customLayout);
        Button ok= customLayout.findViewById(R.id.btn_dialog);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), DashboardStudente.class);
                startActivity(in);
            }
        });
        builder.show();
    }
}
