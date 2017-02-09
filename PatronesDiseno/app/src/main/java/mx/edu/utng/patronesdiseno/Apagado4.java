package mx.edu.utng.patronesdiseno;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by ZENAIDO-PC on 07/02/2017.
 */
public class Apagado4 extends Control4 {

    @Override
    public void presionarSwitch(Bandera bandera, Canvas canvas) {

        bandera.setEstado(new Encendido4());

        Paint paint1=new Paint();
        Path path1 = new Path();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.parseColor("#40FF00"));

        path1.moveTo(100,400);

        path1.lineTo(200,400);
        path1.lineTo(200,650);
        path1.lineTo(100,650);
        path1.lineTo(100,400);

        path1.close();

        canvas.drawPath(path1,paint1);

        Paint paint2=new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#FFFF00"));


        path2.moveTo(300,400);
        path2.lineTo(400,400);
        path2.lineTo(400,650);
        path2.lineTo(300,650);
        path2.lineTo(300,400);

        path2.close();

        canvas.drawPath(path2, paint2);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#0040FF"));


        path3.moveTo(550,400);
        path3.lineTo(650,400);
        path3.lineTo (650,650);
        path3.lineTo(550,650);
        path3.lineTo (550,400);

        path3.close();

        canvas.drawPath(path3, paint3);




        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#0040FF"));


        path4.moveTo(550,400);
        path4.lineTo(650,400);
        path4.lineTo (650,650);
        path4.lineTo(550,650);
        path4.lineTo (550,400);

        path4.close();

        canvas.drawPath(path4, paint4);




    }


}
