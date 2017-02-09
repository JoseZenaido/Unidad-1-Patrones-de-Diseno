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
public class PrototypeActivity10 extends AppCompatActivity {
    private EditText edtMarca;
    private EditText edtColor;
    private  EditText edtNumSerie;
    private EditText edtRodada;

    private Button btnClonar;

    private GridView grvBisi;
    private ArrayList<Bicicleta>bicicletas;
    private Bicicleta bicicleta;
    private BicicletaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype10);
        edtMarca = (EditText)findViewById(R.id.edt_marcabisi);
        edtColor = (EditText)findViewById(R.id.edt_colorVisicle);
        edtNumSerie = (EditText)findViewById(R.id.edt_n_serieBi);
        edtRodada =(EditText)findViewById(R.id.edt_rodada);

        btnClonar = (Button)findViewById(R.id.btn_clonarbicicle);

        grvBisi = (GridView)findViewById(R.id.grv_bicicleta);

        bicicletas= new ArrayList<Bicicleta>();
        bicicleta = new Bicicleta();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bicicleta.setMarca(edtMarca.getText().toString());
                bicicleta.setColor(edtColor.getText().toString());
                bicicleta.setNumSerie(edtNumSerie.getText().toString());
                bicicleta.setRodada(edtRodada.getText().toString());

               /* botella.setContenido(Integer.parseInt(edtContenido.getText().toString()));*/

                Bicicleta clon = (Bicicleta) bicicleta.clonable();
                bicicletas.add(clon);

                adapter = new BicicletaAdapter(PrototypeActivity10.this, (ArrayList)bicicletas);
                grvBisi.setAdapter(adapter);
            }
        });


    }




}
