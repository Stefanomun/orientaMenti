package g13Team.orientaMenti;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MenuStudente extends AppCompatActivity{

    private Toolbar toolbar;
    private MenuStudente menuStudente;

    public void create(MenuStudente dashboardStudente) {
        this.menuStudente = dashboardStudente;
        toolbar = (Toolbar) dashboardStudente.findViewById(R.id.toolbar);
        dashboardStudente.setSupportActionBar(toolbar);
    }

    public void menu(View view) {
        toolbar.showOverflowMenu();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.messaggi:
                Toast.makeText(menuStudente, "Messaggi", Toast.LENGTH_SHORT).show();
                break;

            case R.id.profilo:
                Toast.makeText(menuStudente, "Profilo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Toast.makeText(menuStudente, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_studente, menu);
        return true;
    }
}
