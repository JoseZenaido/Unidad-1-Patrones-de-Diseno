package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * Created by ZENAIDO-PC on 02/02/2017.
 */
public class StateActivity15 extends MainActivity {
    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo4 lienzo;

    private Apagado4 estadoInicial;
    private Bandera bandera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state15);
        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado4();
        bandera = new Bandera(estadoInicial);
        lienzo = new Lienzo4(this, estadoInicial, bandera);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(bandera.getEstado());
                bandera.presionarBoton();
                lienzo.invalidate();
            }
        });
    }

}
