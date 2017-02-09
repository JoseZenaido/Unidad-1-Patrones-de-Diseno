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
public class BicicletaAdapter extends ArrayAdapter<Bicicleta> {
    public BicicletaAdapter(Context context, ArrayList<Bicicleta> bisicletas){
        super(context, 0, bisicletas);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Bicicleta bisicleta = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bicicleta_layout, parent,false);
        }
        TextView txvBici = (TextView)convertView.findViewById(R.id.txv_bs);

        txvBici.setText(bisicleta.getMarca()+" "+bisicleta.getColor()+" "+bisicleta.getNumSerie());
        return convertView;
    }
}
