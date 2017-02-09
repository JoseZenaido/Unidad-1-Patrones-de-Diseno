package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo8 extends View {

    private Vaso estrella;

    public Lienzo8(Context context, Vaso estrella){
        super(context);
        this.estrella = estrella;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estrella !=null){
            estrella.dibujar(canvas, estrella.getColor());
        }
    }

    public Vaso getEstrella() {
        return estrella;
    }

    public void setEstrella(Vaso estrella) {
        this.estrella = estrella;
    }
}
