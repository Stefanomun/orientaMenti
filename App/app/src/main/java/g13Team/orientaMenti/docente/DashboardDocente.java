package g13Team.orientaMenti.docente;

import android.os.Bundle;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocenteHR;

public class DashboardDocente extends MenuDocenteHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_docente);

        super.create(this);
    }
}