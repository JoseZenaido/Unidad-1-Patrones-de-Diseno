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
public class CasaAdapter extends ArrayAdapter<Casa1> {
    public CasaAdapter(Context context, ArrayList<Casa1> casas){
        super(context, 0, casas);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Casa1 casa = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.casa_layout, parent,false);
        }
        TextView txvCasa = (TextView)convertView.findViewById(R.id.txv_casa);

        txvCasa.setText(casa.getTamano()+" "+casa.getColor()+" "+casa.getUbicacion());
        return convertView;
    }
}
