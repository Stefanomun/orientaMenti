package g13Team.orientaMenti.studente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;

public class Messaggi extends AppCompatActivity {
ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaggi);
        logo=findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo= new Intent(getApplicationContext(), DashboardStudente.class);
                startActivity(goTo);
            }
        });
    }

    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(),DashboardStudente.class);
        startActivity(in);
    }

   public void readMes1(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio1.class);
        startActivity(in);
    }

    public void readMes2(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio2.class);
        startActivity(in);
    }

    public void readMes3(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio3.class);
        startActivity(in);
    }

    public void readMes4(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio4.class);
        startActivity(in);
    }

    public void readMes5(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio5.class);
        startActivity(in);
    }

    public void readMes6(View v){
        Intent in= new Intent(getApplicationContext(), Messaggio6.class);
        startActivity(in);
    }


}
