package mx.edu.utng.patronesdiseno;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanzarSingleton1(View view) {
        Intent i = new Intent(this, SingletonActivity1.class );
        startActivity(i);
    }
    public void lanzarSingleton2(View view) {
        Intent i = new Intent(this, SingletonActivity2.class );
        startActivity(i);
    }
    public void lanzarSingleton3(View view) {
        Intent i = new Intent(this, SingletonActivity3.class );
        startActivity(i);
    }
    public void lanzarSingleton4(View view) {
        Intent i = new Intent(this, SingletonActivity4.class );
        startActivity(i);
    }
    public void lanzarSingleton5(View view) {
        Intent i = new Intent(this, SingletonActivity5.class );
        startActivity(i);
    }
    public void lanzarPrototype6(View view) {
        Intent i = new Intent(this, PrototypeActivity6.class );
        startActivity(i);
    }
    public void lanzarPrototype7(View view) {
        Intent i = new Intent(this, PrototypeActivity7.class );
        startActivity(i);
    }
    public void lanzarPrototype8(View view) {
        Intent i = new Intent(this, PrototypeActivity8.class );
        startActivity(i);
    }
    public void lanzarPrototype9(View view) {
        Intent i = new Intent(this, PrototypeActivity9.class );
        startActivity(i);
    }
    public void lanzarPrototype10(View view) {
        Intent i = new Intent(this, PrototypeActivity10.class );
        startActivity(i);
    }
    public void lanzarState11(View view) {
        Intent i = new Intent(this, StateActivity11.class );
        startActivity(i);
    }

    public void lanzarState12(View view) {
        Intent i = new Intent(this, StateActivity12.class );
        startActivity(i);
    }
    public void lanzarState13(View view) {
        Intent i = new Intent(this, StateActivity13.class );
        startActivity(i);
    }
    public void lanzarState14(View view) {
        Intent i = new Intent(this, StateActivity14.class );
        startActivity(i);
    }
    public void lanzarState15(View view) {
        Intent i = new Intent(this, StateActivity15.class );
        startActivity(i);
    }
    public void lanzarFactory16(View view){
        Intent i = new Intent(this, FactoryActivity16.class );
        startActivity(i);
    }
    public void lanzarFactory17(View view){
        Intent i = new Intent(this, FactoryActivity17.class );
        startActivity(i);
    }
    public void lanzarMemento18(View view){
        Intent i = new Intent(this, MementoActivity18.class );
        startActivity(i);
    }
    public void lanzarMemento19(View view){
        Intent i = new Intent(this, MementoActivity19.class );
        startActivity(i);
    }
    public void lanzarMemento20(View view){
        Intent i = new Intent(this, MementoActivity20.class );
        startActivity(i);
    }


}
