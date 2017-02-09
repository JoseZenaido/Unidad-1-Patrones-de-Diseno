package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class LienzoState extends View {

    private ControlComida estado;
    private LeonState leonState;

    public LienzoState(Context context, ControlComida estado, LeonState leonState){
        super(context);
        this.estado = estado;
        this.leonState = leonState;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&& leonState !=null){
            leonState.setCanvas(canvas);
            estado.presionarSwitch(leonState, canvas);
        }
    }

    public ControlComida getEstado() {
        return estado;
    }

    public void setEstado(ControlComida estado) {
        this.estado = estado;
    }
}
