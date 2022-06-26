package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;

public class Messaggio5 extends AppCompatActivity {
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaggio5);

        logo=findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo= new Intent(getApplicationContext(), DashboardStudente.class);
                startActivity(goTo);
            }
        });
    }

    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(), ListaAziende.class);
        startActivity(in);
    }

    public void goBack(View v){
        Intent in = new Intent(getApplicationContext(), Messaggi.class);
        startActivity(in);
    }
}
