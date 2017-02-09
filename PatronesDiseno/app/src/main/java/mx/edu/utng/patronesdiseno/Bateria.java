package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;

/**
 * Created by
 */
public class Bateria {

    private Control3 estado;
    private Canvas canvas;

    public Bateria(Control3 estado){
        this.estado=estado;
    }

    public  void presionarBoton(){
        estado.presionarSwitch(this,canvas);
    }
    public Control3 getEstado() {
        return estado;
    }

    public void setEstado(Control3 estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }




}

