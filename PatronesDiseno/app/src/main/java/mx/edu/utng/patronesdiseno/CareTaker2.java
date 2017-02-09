package mx.edu.utng.patronesdiseno;

import java.util.ArrayList;


public class CareTaker2 {
    private ArrayList<Memento2> mementos = new ArrayList<Memento2>();

    public void addMemento(Memento2 memento){
        mementos.add(memento);
    }

    public Memento2 getMemento(int index){
        return  mementos.get(index);
    }

    public ArrayList<Memento2> getMementos() {
        return mementos;
    }
}
