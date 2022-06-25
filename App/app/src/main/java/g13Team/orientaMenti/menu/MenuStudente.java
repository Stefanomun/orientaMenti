package g13Team.orientaMenti.menu;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;

public class MenuStudente extends Menu {

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.messaggi:
                Toast.makeText(menu, "Messaggi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profilo:
                Toast.makeText(menu, "Profilo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}
