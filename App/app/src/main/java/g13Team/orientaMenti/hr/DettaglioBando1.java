package g13Team.orientaMenti.hr;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;
import g13Team.orientaMenti.menu.MenuHR;
import g13Team.orientaMenti.studente.RegistrazioneStudente;

public class DettaglioBando1 extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_bando1);
        super.create(this);
    }

    public void indietro (View v){
        Intent in= new Intent(getApplicationContext(), ListaBandiHR.class);
        startActivity(in);
    }

    public void home(View v){
        Intent in= new Intent(getApplicationContext(), DashboardHR.class);
        startActivity(in);
    }

    public void studente1(View v){
        Intent goStudente1= new Intent(getApplicationContext(), ContattoStudente1.class);
        startActivity(goStudente1);
    }

    public void studente2(View v){
        Intent goStudente2= new Intent (getApplicationContext(), ContattoStudente2.class);
        startActivity(goStudente2);
    }

    public void chiudi(View v){
        AlertDialog.Builder builder= new AlertDialog.Builder(DettaglioBando1.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.custom_alert_dialog_confirm_close_bando, null);
        builder.setView(customLayout);
        Button no= customLayout.findViewById(R.id.btn_no);
        Button si= customLayout.findViewById(R.id.btn_yes);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getApplicationContext(), DettaglioBando1.class);
                startActivity(in);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getApplicationContext(), ListaBandiHR.class);
                startActivity(in);
            }
        });
        builder.show();
    }
}
