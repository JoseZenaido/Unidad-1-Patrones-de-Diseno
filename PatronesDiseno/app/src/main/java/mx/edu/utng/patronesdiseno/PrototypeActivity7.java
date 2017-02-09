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
public class PrototypeActivity7 extends AppCompatActivity {
    private EditText edtTamano;
    private EditText edtColor;
    private  EditText edtUbicacion;
    private  EditText edtMaterial;

    private Button btnClonar;

    private GridView grvCasa;
    private ArrayList<Casa1>casas;
    private Casa1 casa;
    private CasaAdapter adapter;

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype7);
        edtTamano = (EditText)findViewById(R.id.edt_casaTamano);
        edtColor = (EditText)findViewById(R.id.edt_casaColor);
        edtUbicacion = (EditText)findViewById(R.id.edt_casaUbicacion);
        edtMaterial=(EditText)findViewById(R.id.edt_material);

        btnClonar = (Button)findViewById(R.id.btn_clonar1);

        grvCasa = (GridView)findViewById(R.id.grv_casa);

        casas= new ArrayList<Casa1>();
        casa = new Casa1();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                casa.setTamano(edtTamano.getText().toString());
                casa.setColor(edtColor.getText().toString());
                casa.setUbicacion(edtUbicacion.getText().toString());
                casa.setMaterial(edtMaterial.getText().toString());

                Casa1 clon = (Casa1) casa.clonable();
                casas.add(clon);

                adapter = new CasaAdapter(PrototypeActivity7.this, (ArrayList)casas);
                grvCasa.setAdapter(adapter);
            }
        });
    }

}
