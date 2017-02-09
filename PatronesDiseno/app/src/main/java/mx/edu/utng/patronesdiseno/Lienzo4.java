package mx.edu.utng.patronesdiseno;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by ZENAIDO-PC on 07/02/2017.
 */
public class Lienzo4 extends View{

    private Control4 estado;
    private Bandera bandera;
    public Lienzo4(Context context, Control4 estado, Bandera bandera){
        super(context);
        this.estado=estado;
        this.bandera = bandera;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && bandera != null){
            bandera.setCanvas(canvas);
            estado.presionarSwitch(bandera,canvas);
        }
    }

    public Bandera getTv() {
        return bandera;
    }

    public void setTv(Bandera bandera) {
        this.bandera = bandera;
    }

    public Control4 getEstado() {
        return estado;
    }
    public void setEstado(Control4 estado) {
        this.estado = estado;
    }


}
