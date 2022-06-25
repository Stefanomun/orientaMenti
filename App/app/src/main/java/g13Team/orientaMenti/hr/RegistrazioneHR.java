package g13Team.orientaMenti.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;

public class RegistrazioneHR extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_hr);
    }
    public void indietro(View v){
        Intent in= new Intent(getApplicationContext(), Login.class);
        startActivity(in);
    }
    public void regHR(View v){
        Intent in= new Intent(getApplicationContext(), Login.class);
        startActivity(in);
    }
}
