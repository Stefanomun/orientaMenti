package g13Team.orientaMenti.hr;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class ContattoStudente6 extends MenuHR {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatto_studente4);
        logo = findViewById(R.id.logo);


        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo = new Intent(getApplicationContext(), DashboardHR.class);
                startActivity(goTo);
            }

        });
        super.create(this);
    }

    public void indietro(View view){
        Intent intent = new Intent(ContattoStudente6.this, ListaStudentiHR.class);
        startActivity(intent);
    }

    public void contatta(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ContattoStudente6.this);
        final View customLayout = getLayoutInflater().inflate(R.layout.custom_alert_dialog_student_contact, null);
        builder.setView(customLayout);
        Button goBack = customLayout.findViewById(R.id.btn_dialog);
        goBack.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), ListaStudentiHR.class);
                startActivity(in);
            }
        });

        builder.show();
    }
}
