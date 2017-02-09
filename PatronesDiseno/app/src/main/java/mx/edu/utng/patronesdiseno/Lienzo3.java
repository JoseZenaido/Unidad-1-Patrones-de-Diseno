package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo3 extends View{
    private Control3 estado;
    private Bateria bateria;
    public Lienzo3(Context context, Control3 estado, Bateria bateria){
        super(context);
        this.estado=estado;
        this.bateria = bateria;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && bateria != null){
            bateria.setCanvas(canvas);
            estado.presionarSwitch(bateria,canvas);
        }
    }

    public Bateria getTv() {
        return bateria;
    }

    public void setTv(Bateria bateria) {
        this.bateria = bateria;
    }

    public Control3 getEstado() {
        return estado;
    }
    public void setEstado(Control3 estado) {
        this.estado = estado;
    }
}
