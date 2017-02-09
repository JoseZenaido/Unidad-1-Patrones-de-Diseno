package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class SingletonActivity1 extends MainActivity {
    private EditText edtMarca;
    private EditText edtModelo;
    private EditText edtColor;
    private EditText edtAlimentacion;

    private Button btnCrear;


    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton1);
        edtMarca =(EditText)findViewById(R.id.edt_marca);
        edtModelo = (EditText)findViewById(R.id.edt_modelo);
        edtColor = (EditText)findViewById(R.id.edt_color);
        edtAlimentacion=(EditText)findViewById(R.id.edt_alimentacion);

        btnCrear = (Button)findViewById(R.id.bt_registrar);


        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mouse mouse = Mouse.getUnicaInstancia();

                mouse.setMarca(edtMarca.getText().toString());
                mouse.setModelo(edtModelo.getText().toString());
                mouse.setColor(edtColor.getText().toString());
                mouse.setAlimentacion(edtAlimentacion.getText().toString());


                Toast.makeText(SingletonActivity1.this, "MOUSE CREADO:"
                        +"\nMarca:" + mouse.getMarca()
                        +"\nModelo:"+mouse.getModelo()
                        +"\nColor:"+mouse.getColor()
                        +"\nAlimentacion:"+mouse.getAlimentacion(),

                        Toast.LENGTH_SHORT).show();
            }
        });
    }






}
