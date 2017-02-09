package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class SingletonActivity2 extends MainActivity {
    private EditText edtNombre;
    private EditText edtEdad;
    private EditText edtPeso;
    private EditText edtEstatura;
    private EditText edtEnfermedad;
    private EditText edtLocalizacion;

    private Button btnCrear;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton2);
        edtNombre =(EditText)findViewById(R.id.edt_nombre);
        edtEdad = (EditText)findViewById(R.id.edt_edad);
        edtPeso = (EditText)findViewById(R.id.edt_peso);
        edtEstatura=(EditText)findViewById(R.id.edt_estatura);
        edtEnfermedad = (EditText)findViewById(R.id.edt_enfermedad);
        edtLocalizacion=(EditText)findViewById(R.id.edt_localizacion);

        btnCrear = (Button)findViewById(R.id.bt_registrar);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona persona = Persona.getUnicaInstancia();

                persona.setNombre(edtNombre.getText().toString());
                persona.setEdad(edtEdad.getText().toString());
                persona.setPeso(edtPeso.getText().toString());
                persona.setEstatura(edtEstatura.getText().toString());
                persona.setEnfermedad(edtEnfermedad.getText().toString());
                persona.setLocalizacion(edtLocalizacion.getText().toString());


                Toast.makeText(SingletonActivity2.this, "PERSONA CREADA:"
                        +"\nNombre:" + persona.getNombre()
                        +"\nEdad:"+persona.getEdad()
                        +"\nPeso:"+persona.getPeso()
                        +"\nEstatura:"+persona.getEstatura()
                        +"\nEnfermedad:"+persona.getEnfermedad()
                        +"\nLocalizacion:"+persona.getLocalizacion(),

                        Toast.LENGTH_SHORT).show();
            }
        });
    }






}
