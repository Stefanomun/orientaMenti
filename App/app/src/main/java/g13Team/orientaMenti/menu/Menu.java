package g13Team.orientaMenti.menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import g13Team.orientaMenti.R;

public abstract class Menu extends AppCompatActivity {

    protected Toolbar toolbar;
    protected Menu menu;

    public void create(Menu dashboard) {
        this.menu = dashboard;
        toolbar = (Toolbar) dashboard.findViewById(R.id.toolbar);
        dashboard.setSupportActionBar(toolbar);
    }

    public void menu(View view) {
        toolbar.showOverflowMenu();
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_studente, menu);
        return true;
    }
}
