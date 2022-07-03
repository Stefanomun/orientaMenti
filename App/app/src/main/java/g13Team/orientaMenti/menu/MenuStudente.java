package g13Team.orientaMenti.menu;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;
import g13Team.orientaMenti.studente.Messaggi;
import g13Team.orientaMenti.studente.ProfiloStudente;

public class MenuStudente extends Menu {

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.messaggi:
                Intent messaggi = new Intent(this, Messaggi.class);
                startActivity(messaggi);
                Toast.makeText(menu, "Messaggi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profilo:
                Intent profilo = new Intent(getApplicationContext(), ProfiloStudente.class);
                startActivity(profilo);
                Toast.makeText(menu, "Profilo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_studente, menu);
        return true;
    }
}
