package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

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
        Intent save= new Intent(getApplicationContext(), DashboardHR.class);
        startActivity(save);
        Toast.makeText(getApplicationContext(), "Salvataggio effettuato", Toast.LENGTH_SHORT).show();
    }
}
