package g13Team.orientaMenti.menu;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.docente.ProfiloDocente;
import g13Team.orientaMenti.login.Login;

public class MenuDocente extends Menu {
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profilo:
                Intent profilo = new Intent(getApplicationContext(), ProfiloDocente.class);
                startActivity(profilo);
                break;

            case R.id.logout:
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_docente_hr, menu);
        return true;
    }
}
