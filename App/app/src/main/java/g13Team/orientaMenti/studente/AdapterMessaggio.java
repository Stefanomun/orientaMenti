package g13Team.orientaMenti.studente;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import g13Team.orientaMenti.R;

public class AdapterMessaggio extends ArrayAdapter<String> {
    private LayoutInflater inflater = null;
    private int conter = 0;

    public AdapterMessaggio(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            if((conter++ % 2) == 0)
                view = inflater.inflate(R.layout.activity_messaggio_ricevuto, null);
            else
                view = inflater.inflate(R.layout.activity_messaggio_inviato, null);
        }

        TextView textView = view.findViewById(R.id.testoMessaggio);

        textView.setText(getItem(position));

        return view;
    }
}
