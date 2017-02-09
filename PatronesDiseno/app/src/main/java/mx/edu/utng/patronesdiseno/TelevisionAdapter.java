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
public class TelevisionAdapter extends ArrayAdapter<Television> {
    public TelevisionAdapter(Context context, ArrayList<Television>televisions ){
        super(context, 0, televisions);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Television television = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.television_layout, parent,false);
        }
        TextView txvTV = (TextView)convertView.findViewById(R.id.txv_tv);

        txvTV.setText(television.getTamano()+" "+television.getMarca()+" "+television.getIntensidad());
        return convertView;
    }
}
