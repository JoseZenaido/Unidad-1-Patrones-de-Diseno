package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;


public class Vaso {
    private int color;

    public Vaso(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);

        Path path = new Path();


        path.moveTo(275, 250);

        path.lineTo(300, 350);

        path.lineTo(350, 350);
        path.lineTo(375, 250);

        path.close();
        canvas.drawPath(path, paint);

    }

    public Memento8 guardarMemento() {
        return new Memento8(color);
    }
    public void restaurarMemento(Memento8 m) {
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
