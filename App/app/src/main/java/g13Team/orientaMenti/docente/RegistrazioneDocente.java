package g13Team.orientaMenti.docente;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.login.Login;

public class RegistrazioneDocente extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_docente);
    }

    public void indietro(View v) {
        Intent in = new Intent(getApplicationContext(), Login.class);
        startActivity(in);
    }

    public void regDoc(View v) {
        AlertDialog.Builder builder= new AlertDialog.Builder(RegistrazioneDocente.this);
        final View customLayout= getLayoutInflater().inflate(R.layout.custom_alert_dialog, null);
        builder.setView(customLayout);
        Button ok= customLayout.findViewById(R.id.btn_dialog);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), DashboardDocente.class);
                startActivity(in);
            }
        });
        builder.show();
    }
}