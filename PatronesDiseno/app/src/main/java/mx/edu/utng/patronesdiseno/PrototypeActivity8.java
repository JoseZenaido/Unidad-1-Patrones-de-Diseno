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
public class PrototypeActivity8 extends AppCompatActivity {
    private EditText edtTamano;
    private EditText edtColor;
    private  EditText edtCosto;
    private EditText edtMaterial;

    private Button btnClonar;

    private GridView grvPuerta;
    private ArrayList<Puerta>puertas;
    private Puerta puerta;
    private PuertaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype8);
        edtTamano = (EditText)findViewById(R.id.edt_puertaTamano);
        edtColor = (EditText)findViewById(R.id.edt_puertaColor);
        edtCosto = (EditText)findViewById(R.id.edt_puertaCosto);
        edtMaterial=(EditText)findViewById(R.id.edt_material);

        btnClonar = (Button)findViewById(R.id.btn_clonarPuerta);

        grvPuerta = (GridView)findViewById(R.id.grv_puerta);

        puertas= new ArrayList<Puerta>();
        puerta = new Puerta();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puerta.setTamano(edtTamano.getText().toString());
                puerta.setColor(edtColor.getText().toString());
                puerta.setCosto(edtCosto.getText().toString());
                puerta.setMaterial(edtMaterial.getText().toString());

                Puerta clon = (Puerta) puerta.clonable();
                puertas.add(clon);

                adapter = new PuertaAdapter(PrototypeActivity8.this, (ArrayList)puertas);
                grvPuerta.setAdapter(adapter);
            }
        });


    }




}
