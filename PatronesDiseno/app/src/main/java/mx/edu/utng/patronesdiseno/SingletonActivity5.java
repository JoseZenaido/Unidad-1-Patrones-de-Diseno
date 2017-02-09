package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class SingletonActivity5 extends MainActivity {
    private EditText edtMarca;
    private EditText edtCapacidad;
    private EditText edtSistemaArchivos;
    private EditText edtTipo;
    private EditText edtUnidad;


    private Button btnCrear;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton5);
        edtMarca =(EditText)findViewById(R.id.edt_marca);
        edtCapacidad = (EditText)findViewById(R.id.edt_capacidad);
        edtSistemaArchivos = (EditText)findViewById(R.id.edt_sistemaArchivos);
        edtTipo =(EditText)findViewById(R.id.edt_tipo);
        edtUnidad = (EditText)findViewById(R.id.edt_unidad);


        btnCrear = (Button)findViewById(R.id.bt_registrar);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiscoDuro discoDuro = DiscoDuro.getDiscoDuro();

                discoDuro.setMarca(edtMarca.getText().toString());
                discoDuro.setCapacidad(edtCapacidad.getText().toString());
                discoDuro.setSistemaArchivos(edtSistemaArchivos.getText().toString());
                discoDuro.setTipo(edtTipo.getText().toString());
                discoDuro.setUnidad(edtUnidad.getText().toString());



                Toast.makeText(SingletonActivity5.this, "DISCO DURO CREADO:"
                        +"\nMARCA:" + discoDuro.getMarca()
                        +"\nCAPACIDAD:"+discoDuro.getCapacidad()
                        +"\nSISTEMA ARCHIVOS:"+discoDuro.getSistemaArchivos()
                        +"\nTIPO:"+discoDuro.getTipo()
                        +"\nUNIDAD:"+discoDuro.getUnidad(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }






}
