package g13Team.orientaMenti.hr;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.ProfiloStudente;

public class ProfiloHR extends MenuHR {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo_hr);
    }

    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(), DashboardHR.class);
        startActivity(in);
    }

    public void save(View v){
        AlertDialog.Builder builder= new AlertDialog.Builder(ProfiloHR.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.activity_conferma_salvataggio, null);
        builder.setView(customLayout);
        Button ok= customLayout.findViewById(R.id.btn_dialog);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), DashboardHR.class);
                startActivity(in);
            }
        });
        builder.show();
    }
}
