package g13Team.orientaMenti.studente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ConfermaCandidatura;
import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.ListaBandiAzienda3;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class BandoConsulenteAziendale extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bando_consulente_aziendale);
        super.create(this);
    }

    public void indietro(View view){
        Bundle bundle = getIntent().getExtras();
        String bando = "";
        if(bundle != null){
            bando = bundle.getString("bando");
        }
        System.out.println(bando);
        Intent intent = null;
        if(bando.equals("intesa")){
            intent = new Intent(BandoConsulenteAziendale.this, ListaBandiAzienda3.class);
            bando = null;
        }else{
        intent = new Intent(BandoConsulenteAziendale.this, ListaBandi.class);
        }
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(BandoConsulenteAziendale.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void candidatura(View view){
        Intent intent = new Intent(BandoConsulenteAziendale.this, ConfermaCandidatura.class);
        startActivity(intent);
    }
}