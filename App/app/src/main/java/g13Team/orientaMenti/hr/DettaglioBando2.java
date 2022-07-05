package g13Team.orientaMenti.hr;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class DettaglioBando2 extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_bando2);
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

    public void studente4(View v){
        Intent goStudente4= new Intent(getApplicationContext(), ContattoStudente4.class);
        startActivity(goStudente4);
    }

    public void studente5(View v){
        Intent goStudente5= new Intent (getApplicationContext(), ContattoStudente5.class);
        startActivity(goStudente5);
    }

    public void studente6(View v){
        Intent goStudente6= new Intent (getApplicationContext(), ContattoStudente6.class);
        startActivity(goStudente6);
    }

    public void chiudi(View v){
        AlertDialog.Builder builder= new AlertDialog.Builder(DettaglioBando2.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.custom_alert_dialog_confirm_close_bando, null);
        builder.setView(customLayout);
        Button no= customLayout.findViewById(R.id.btn_no);
        Button si= customLayout.findViewById(R.id.btn_yes);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(getApplicationContext(), DettaglioBando2.class);
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
