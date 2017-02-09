package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo5 extends View{
    private Figura figura;

    public Lienzo5(Context context, Figura figura) {
        super(context);
        this.figura = figura;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(figura!=null) {
            figura.dibujar(canvas);
        }
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }
}
