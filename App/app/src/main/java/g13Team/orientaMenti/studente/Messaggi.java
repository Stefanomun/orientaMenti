package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import g13Team.orientaMenti.Chat;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuStudente;

public class Messaggi extends MenuStudente {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaggi);
        logo = findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo = new Intent(getApplicationContext(), DashboardStudente.class);
                startActivity(goTo);
            }
        });

        super.create(this);
    }

    public void indietro(View v) {
        Intent in = new Intent(this, DashboardStudente.class);
        startActivity(in);
    }

    public void chat(View v) {
        Intent in = new Intent(this, Chat.class);
        startActivity(in);
    }


}
