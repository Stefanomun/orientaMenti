package g13Team.orientaMenti.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import g13Team.orientaMenti.R;

public class LoginError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_error);
    }

    public void indietro(View view){
        Intent intent = new Intent(LoginError.this, Login.class);
        startActivity(intent);
    }
}