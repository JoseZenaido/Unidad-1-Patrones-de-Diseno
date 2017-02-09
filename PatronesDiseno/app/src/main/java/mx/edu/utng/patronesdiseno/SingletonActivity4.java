package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class SingletonActivity4 extends MainActivity {
    private EditText edtMarca;
    private EditText edtColor;
    private EditText edtTamano;
    private EditText edtExportador;
    private EditText edtCalidad;


    private Button btnCrear;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton4);
        edtMarca =(EditText)findViewById(R.id.edt_marca);
        edtColor = (EditText)findViewById(R.id.edt_color);
        edtTamano = (EditText)findViewById(R.id.edt_tamano);
        edtExportador =(EditText)findViewById(R.id.edt_exportador);
        edtCalidad = (EditText)findViewById(R.id.edt_calidad);


        btnCrear = (Button)findViewById(R.id.bt_registrar);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lapicero lapicero = Lapicero.getLapicero();

                lapicero.setMarca(edtMarca.getText().toString());
                lapicero.setColor(edtColor.getText().toString());
                lapicero.setTamano(edtTamano.getText().toString());
                lapicero.setExportador(edtExportador.getText().toString());
                lapicero.setCalidad(edtCalidad.getText().toString());



                Toast.makeText(SingletonActivity4.this, "LAPICERO CREADO:"
                        +"\nMARCA:" + lapicero.getMarca()
                        +"\nCOLOR:"+lapicero.getColor()
                        +"\nTAMANO:"+lapicero.getTamano()
                        +"\nEXPORTADOR:"+lapicero.getExportador()
                        +"\nCALIDAD:"+lapicero.getCalidad(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }






}
