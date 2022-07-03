package g13Team.orientaMenti.docente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import g13Team.orientaMenti.Questionario;
import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuDocente;

public class ListaStudentiDocente extends MenuDocente {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_studenti_docente);
        super.create(this);
    }

    public void questionario(View view){
        int layout = view.getId();
        String card = view.findViewById(layout).toString();
        Intent intent = new Intent(ListaStudentiDocente.this, Questionario.class);
        if(card.contains("id/card1")){
            intent.putExtra("nome", "Marta Rossi");
        } else if(card.contains("id/card2")){
            intent.putExtra("nome", "Alberto Fontana");
        } else if(card.contains("id/card3")){
            intent.putExtra("nome", "Roberta Russo");
        }
        startActivity(intent);
    }

    public void indietro(View view){
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }

    public void home(View view){
        Intent intent = new Intent(ListaStudentiDocente.this, DashboardDocente.class);
        startActivity(intent);
    }
}