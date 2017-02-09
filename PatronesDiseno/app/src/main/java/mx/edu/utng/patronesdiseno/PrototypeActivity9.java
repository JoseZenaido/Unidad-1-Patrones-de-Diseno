package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class PrototypeActivity9 extends AppCompatActivity {
    private EditText edtMarca;
    private EditText edtTamano;
    private  EditText edtIntensidad;
    private EditText edtBrillantez;

    private Button btnClonar;

    private GridView grvTV;
    private ArrayList<Television>televisions;
    private Television television;
    private TelevisionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype9);
        edtMarca = (EditText)findViewById(R.id.edt_marcaTele);
        edtTamano = (EditText)findViewById(R.id.edt_tamanoTv);
        edtIntensidad = (EditText)findViewById(R.id.edt_intensidadTv);
        edtBrillantez=(EditText)findViewById(R.id.edt_brillantez);

        btnClonar = (Button)findViewById(R.id.btn_clonarTV);

        grvTV = (GridView)findViewById(R.id.grv_tv);

        televisions= new ArrayList<Television>();
        television = new Television();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                television.setTamano(edtTamano.getText().toString());
                television.setMarca(edtTamano.getText().toString());
                television.setIntensidad(edtIntensidad.getText().toString());
                television.setBrillantez(edtBrillantez.getText().toString());

                Television clon = (Television) television.clonable();
                televisions.add(clon);

                adapter = new TelevisionAdapter(PrototypeActivity9.this, (ArrayList)televisions);
                grvTV.setAdapter(adapter);
            }
        });


    }

}
