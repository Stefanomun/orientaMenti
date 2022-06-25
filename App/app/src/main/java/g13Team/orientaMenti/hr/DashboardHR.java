package g13Team.orientaMenti.hr;

import android.os.Bundle;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocenteHR;

public class DashboardHR extends MenuDocenteHR {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_hr);

        super.create(this);
    }
}