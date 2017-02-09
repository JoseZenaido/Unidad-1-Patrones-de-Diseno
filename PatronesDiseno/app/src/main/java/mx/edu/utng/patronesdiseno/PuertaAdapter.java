package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class PuertaAdapter extends ArrayAdapter<Puerta> {
    public PuertaAdapter(Context context, ArrayList<Puerta>puertas ){
        super(context, 0, puertas);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Puerta puerta = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.puerta_layout, parent,false);
        }
        TextView txvPuerta = (TextView)convertView.findViewById(R.id.txv_puerta);

        txvPuerta.setText(puerta.getTamano()+" "+puerta.getColor()+" "+puerta.getCosto());
        return convertView;
    }
}
