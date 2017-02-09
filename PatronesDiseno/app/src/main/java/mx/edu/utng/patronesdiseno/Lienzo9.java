package mx.edu.utng.patronesdiseno;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo9 extends View {

    private Arbol arbol;

    public Lienzo9(Context context, Arbol arbol){
        super(context);
        this.arbol = arbol;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(arbol !=null){
            arbol.dibujar(canvas, arbol.getColor());
        }
    }

    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

}
