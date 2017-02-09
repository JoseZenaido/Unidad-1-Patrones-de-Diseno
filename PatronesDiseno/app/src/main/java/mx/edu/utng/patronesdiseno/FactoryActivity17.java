package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class FactoryActivity17 extends AppCompatActivity {
    private EditText edtImagen;
    private Button btnCrear;
    private ImagenFactory factoy;
    private LinearLayout layPrincipal;
    private Imagen imagen;
    private Lienzo6 lienzo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory17);

        edtImagen=(EditText)findViewById(R.id.edt_Imagen);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factoy = new ImagenFactory();
        layPrincipal = (LinearLayout)findViewById(R.id.ay_principal);
        lienzo= new Lienzo6(FactoryActivity17.this, imagen);

        layPrincipal.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen = factoy.crear(edtImagen.getText().toString());
                lienzo.setImagen(imagen);
                lienzo.invalidate();
            }
        });
    }
}
