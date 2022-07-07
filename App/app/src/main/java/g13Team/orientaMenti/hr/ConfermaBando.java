package g13Team.orientaMenti.hr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import g13Team.orientaMenti.ConfermaCandidatura;
import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;
import g13Team.orientaMenti.studente.DashboardStudente;

public class ConfermaBando extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conferma_bando);
        super.create(this);
    }

    public void no(View view){
        Intent intent = new Intent(ConfermaBando.this, NuovoBando.class);
        startActivity(intent);
    }

    public void si(View view){
        AlertDialog.Builder builder= new AlertDialog.Builder(ConfermaBando.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.activity_pubblicazione_effettuata, null);
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