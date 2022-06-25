package g13Team.orientaMenti.menu;

import android.view.MenuItem;
import android.widget.Toast;

import g13Team.orientaMenti.R;

public class MenuDocenteHR extends Menu {
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.messaggi:
                Toast.makeText(menu, "Messaggi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Toast.makeText(menu, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
