package g13Team.orientaMenti.hr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import g13Team.orientaMenti.R;
import g13Team.orientaMenti.menu.MenuHR;

public class NuovoBando extends MenuHR implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuovo_bando);
        super.create(this);

        Spinner coloredSpinner = findViewById(R.id.tendina);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.titoliStudio,
                R.layout.colored_spinner_layout
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        coloredSpinner.setAdapter(adapter);
        coloredSpinner.setOnItemSelectedListener(this);
    }

    public void pubblicaBando(View view){
        Intent intent = new Intent(NuovoBando.this, ConfermaBando.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}