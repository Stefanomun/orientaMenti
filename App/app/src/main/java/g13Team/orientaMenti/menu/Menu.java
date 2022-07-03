package g13Team.orientaMenti.menu;

import android.view.View;

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

    public abstract boolean onCreateOptionsMenu(android.view.Menu menu);
}
