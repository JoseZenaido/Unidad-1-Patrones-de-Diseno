package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class SingletonActivity3 extends MainActivity {
    private EditText edtMarca;
    private EditText edtTamano;
    private EditText edtContenido;
    private EditText edtTamanoXPocion;
    private EditText edtPorcionXEnvase;
    private EditText edtProteina;
    private EditText edtGrasas;

    private Button btnCrear;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton3);
        edtMarca =(EditText)findViewById(R.id.edt_marca);
        edtTamano = (EditText)findViewById(R.id.edt_tamano);
        edtContenido = (EditText)findViewById(R.id.edt_contenido);
        edtTamanoXPocion =(EditText)findViewById(R.id.edt_tamanoPorcion);
        edtPorcionXEnvase = (EditText)findViewById(R.id.edt_porcionXenvase);
        edtProteina=(EditText)findViewById(R.id.edt_proteina);
        edtGrasas=(EditText)findViewById(R.id.edt_grasas);

        btnCrear = (Button)findViewById(R.id.bt_registrar);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Botella botella = Botella.getBotella();

                botella.setMarca(edtMarca.getText().toString());
                botella.setTamano(edtTamano.getText().toString());
                botella.setContenido(edtContenido.getText().toString());
                botella.setTamanoXPorcion(edtTamanoXPocion.getText().toString());
                botella.setPorcionXEnvase(edtPorcionXEnvase.getText().toString());
                botella.setProteina(edtProteina.getText().toString());
                botella.setGrasa(edtGrasas.getText().toString());


                Toast.makeText(SingletonActivity3.this, "BOTELLA CREADA:"
                        +"\nMarca:" + botella.getMarca()
                        +"\nTamano:"+botella.getTamano()
                        +"\nContenido:"+botella.getContenido()
                        +"\nTamano X Porcion:"+botella.getTamanoXPorcion()
                        +"\nPorcion X Envase:"+botella.getPorcionXEnvase()
                        +"\nProteina:"+botella.getProteina()
                        +"\nGrasas:"+botella.getGrasa(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }






}
