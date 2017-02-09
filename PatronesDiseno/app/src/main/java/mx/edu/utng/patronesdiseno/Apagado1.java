package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class Apagado1 extends Control1{

    @Override
    public void presionarSwitch(Foco foco, Canvas canvas) {
        foco.setEstado(new Encendido1());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;
        paint.setColor(Color.RED);
        canvas.drawCircle((canvas.getWidth() / 2), (canvas.getHeight() / 2), 100, paint);
    }
}



