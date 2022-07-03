package g13Team.orientaMenti.studente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.ConfermaCandidatura;
import g13Team.orientaMenti.ListaBandi;
import g13Team.orientaMenti.ListaBandiAzienda1;
import g13Team.orientaMenti.ListaBandiAzienda2;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class BandoCrewMember extends MenuStudente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bando_crew_member);
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
        if(bando.equals("lidl")){
            intent = new Intent(BandoCrewMember.this, ListaBandiAzienda2.class);
            bando = null;
        }else{
            intent = new Intent(BandoCrewMember.this, ListaBandi.class);
        }
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(BandoCrewMember.this, DashboardStudente.class);
        startActivity(intent);
    }

    public void candidatura(View view){
        Intent intent = new Intent(BandoCrewMember.this, ConfermaCandidatura.class);
        startActivity(intent);
    }
}