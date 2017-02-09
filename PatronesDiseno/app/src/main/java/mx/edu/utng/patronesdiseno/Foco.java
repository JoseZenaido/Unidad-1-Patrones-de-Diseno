package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;

/**
 * Create by
 */
public class Foco {

    private Control1 estado;
    private Canvas canvas;

    public Foco(Control1 estado){
        this.estado=estado;
    }

    public  void presionarBoton(){
        estado.presionarSwitch(this,canvas);
    }
    public Control1 getEstado() {
        return estado;
    }

    public void setEstado(Control1 estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }




}

