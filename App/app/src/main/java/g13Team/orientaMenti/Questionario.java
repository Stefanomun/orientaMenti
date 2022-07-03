package g13Team.orientaMenti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import g13Team.orientaMenti.docente.DashboardDocente;
import g13Team.orientaMenti.docente.ListaStudentiDocente;
import g13Team.orientaMenti.menu.MenuDocente;

public class Questionario extends MenuDocente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);
        TextView nome = (TextView) findViewById(R.id.nome);
        Bundle bundle = getIntent().getExtras();
        nome.setText(bundle.getString("nome"));
        super.create(this);
    }

    public void indietro(View view) {
        Intent intent = new Intent(Questionario.this, ListaStudentiDocente.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(Questionario.this, DashboardDocente.class);
        startActivity(intent);
    }

    public void conferma(View view) {
        Intent intent = new Intent(Questionario.this, ConfermaQuestionario.class);
        startActivity(intent);
    }
}