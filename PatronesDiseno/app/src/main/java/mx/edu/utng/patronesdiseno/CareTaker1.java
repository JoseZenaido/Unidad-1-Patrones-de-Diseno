package mx.edu.utng.patronesdiseno;

import java.util.ArrayList;

/**
 * Created by ZENAIDO-PC on 14/09/2016.
 */
public class CareTaker1 {

    private ArrayList<Memento1> mementos = new ArrayList<Memento1>();

    public void addMemento(Memento1 memento){

        mementos.add(memento);
    }

    public Memento1 getMemento(int index)
    {
        return  mementos.get(index);
    }

    public ArrayList<Memento1> getMementos()   {
        return mementos;
    }
}
