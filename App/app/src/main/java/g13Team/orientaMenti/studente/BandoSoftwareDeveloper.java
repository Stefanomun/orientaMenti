package g13Team.orientaMenti.studente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class BandoSoftwareDeveloper extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bando_software_developer);
        super.create(this);
    }
}