package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;


public class Carro {
    private int color;

    public Carro(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);

        Path path = new Path();

        float mitad = canvas.getWidth()/2;
        float min = Math.min(canvas.getWidth(),
                canvas.getHeight());
        float half = min/2;

        mitad = mitad - half;

        path.moveTo(mitad+half*0.5f, half*0.84f);
        path.lineTo(mitad+half*1.5f, half*0.84f);
        path.lineTo(mitad+half*0.68f, half*1.45f);
        path.lineTo(mitad+half*1.0f, half*0.5f);
        path.lineTo(mitad+half*1.32f, half*1.45f);
        path.lineTo(mitad+half*0.5f, half*0.84f);

        path.close();
        canvas.drawPath(path, paint);


    }

    public Memento2 guardarMemento() {
        return new Memento2(color);
    }
    public void restaurarMemento(Memento2 m) {
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
