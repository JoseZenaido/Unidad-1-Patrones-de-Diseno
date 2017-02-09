package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo2 extends View {

    private Estrella2 estrella;

    public Lienzo2(Context context, Estrella2 estrella){
        super(context);
        this.estrella = estrella;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estrella !=null){
            estrella.dibujar(canvas, estrella.getColor());
        }
    }

    public Estrella2 getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella2 estrella) {
        this.estrella = estrella;
    }
}
