package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import g13Team.orientaMenti.studente.AdapterMessaggio;

public class Chat extends AppCompatActivity {

    private AdapterMessaggio adapterMessaggio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView listView = findViewById(R.id.messaggi);

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
}