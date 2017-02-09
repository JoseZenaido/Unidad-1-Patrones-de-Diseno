package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo7 extends View {

    private Estrella1 estrella;

    public Lienzo7(Context context, Estrella1 estrella){
        super(context);
        this.estrella = estrella;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estrella !=null){
            estrella.dibujar(canvas, estrella.getColor());
        }
    }

    public Estrella1 getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella1 estrella) {
        this.estrella = estrella;
    }
}
