package mx.edu.utng.patronesdiseno;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * Created by ZENAIDO-PC on 02/02/2017.
 */
public class StateActivity13 extends MainActivity {

    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo1 lienzo;

    private Apagado1 estadoInicial;
    private Foco foco;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state13);
        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado1();
        foco= new Foco(estadoInicial);
        lienzo = new Lienzo1(this, estadoInicial, foco);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(foco.getEstado());
                foco.presionarBoton();
                lienzo.invalidate();
            }
        });

    }
}
