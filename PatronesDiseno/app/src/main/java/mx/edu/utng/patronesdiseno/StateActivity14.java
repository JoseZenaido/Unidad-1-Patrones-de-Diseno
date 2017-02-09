package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * Created by ZENAIDO-PC on 02/02/2017.
 */
public class StateActivity14 extends MainActivity {
    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo3 lienzo;

    private Apagado3 estadoInicial;
    private Bateria bateria;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state14);

        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado3();
        bateria = new Bateria(estadoInicial);
        lienzo = new Lienzo3(this, estadoInicial, bateria);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(bateria.getEstado());
                bateria.presionarBoton();
                lienzo.invalidate();
            }
        });


    }
}
