package g13Team.orientaMenti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.login.Login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chiamaLoginStudente(View view){
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("ruolo", "studente");
        startActivity(intent);
    }

    public void chiamaLoginDocente(View view){
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("ruolo", "docente");
        startActivity(intent);
    }

    public void chiamaLoginManager(View view){
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("ruolo", "manager");
        startActivity(intent);
    }
}