package g13Team.orientaMenti.hr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ConfermaCandidatura;
import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class PubblicazioneEffettuata extends MenuHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubblicazione_effettuata);
        super.create(this);
    }

    public void conferma(View view){
        Intent intent = new Intent(PubblicazioneEffettuata.this, DashboardHR.class);
        startActivity(intent);
    }
}