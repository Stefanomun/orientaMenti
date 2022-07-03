package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import g13Team.orientaMenti.menu.MenuStudente;
import g13Team.orientaMenti.studente.AdapterMessaggio;
import g13Team.orientaMenti.studente.DashboardStudente;
import g13Team.orientaMenti.studente.Messaggi;

public class Chat extends MenuStudente {

    private AdapterMessaggio adapterMessaggio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView listView = findViewById(R.id.messaggi);
        super.create(this);

        adapterMessaggio = new AdapterMessaggio(this, R.layout.activity_messaggio_inviato, new ArrayList<String>());

        listView.setAdapter(adapterMessaggio);

        adapterMessaggio.add("Ciao! Abbiamo visitato il tuo profilo e ci sei sembrato la persona adatta per noi! Aspettiamo una tua risposta!");
    }


    public void inviaMessaggio(View view) {
        EditText editText = findViewById(R.id.testoMessaggioDaInviare);

        adapterMessaggio.add(editText.getText().toString());
        adapterMessaggio.add("Ti contatteremo a breve");

        editText.setText("");
    }

    public void indietro(View view) {
        Intent intent = new Intent(Chat.this, Messaggi.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(Chat.this, DashboardStudente.class);
        startActivity(intent);
    }
}