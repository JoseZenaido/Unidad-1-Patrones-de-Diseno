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
public class PrototypeActivity6 extends AppCompatActivity {
    private EditText edtModelo;
    private EditText edtTipo;
    private  EditText edtColor;
    private EditText edtAno;
    private  EditText edtCombustible;

    private Button btnClonar;

    private GridView grvAuto;
    private ArrayList<Auto> autos;
    private Auto auto;
    private AutoAdapter adapter;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype6);
        edtModelo = (EditText)findViewById(R.id.edt_modelo);
        edtTipo = (EditText)findViewById(R.id.edt_tipo);
        edtColor = (EditText)findViewById(R.id.edt_color);
        edtAno = (EditText)findViewById(R.id.edt_ano);
        edtCombustible = (EditText)findViewById(R.id.edt_conbustible);

        btnClonar = (Button)findViewById(R.id.btn_clonar);

        grvAuto = (GridView)findViewById(R.id.grv_auto);

        autos= new ArrayList<Auto>();
        auto = new Auto();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auto.setModelo(edtModelo.getText().toString());
                auto.setColor(edtColor.getText().toString());
                auto.setTipo(edtTipo.getText().toString());
                auto.setAno(edtAno.getText().toString());
                auto.setCombustible(edtCombustible.getText().toString());

                Auto clon = (Auto) auto.clonable();
                autos.add(clon);

                adapter = new AutoAdapter(PrototypeActivity6.this, (ArrayList)autos);
                grvAuto.setAdapter(adapter);
            }
        });


    }

}
