package mx.edu.utng.patronesdiseno;
import android.graphics.Canvas;

/**
 * Created by ZENAIDO-PC on 07/02/2017.
 */
public class Bandera {
    private Control4 estado;
    private Canvas canvas;

    public Bandera(Control4 estado){
        this.estado=estado;
    }


    public  void presionarBoton(){
        estado.presionarSwitch(this,canvas);
    }

    public Control4 getEstado() {
        return estado;
    }

    public void setEstado(Control4 estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
