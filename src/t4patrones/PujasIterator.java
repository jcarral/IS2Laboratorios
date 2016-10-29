package t4patrones;

import java.util.LinkedList;

/**
 * Created by joseba on 29/10/2016.
 */
public class PujasIterator implements ExtendedIterator<Puja> {

    private LinkedList<Puja> listaPujas;
    private int pos;

    public PujasIterator(LinkedList<Puja> listaPujas){
        this.listaPujas = listaPujas;
        pos = 0;
    }

    @Override
    public Puja previous() {
        if(pos < 0 || listaPujas.isEmpty()) return null;
        return listaPujas.get(pos--);
    }

    @Override
    public boolean hasPrevious() {
        if(pos < 0 || listaPujas.isEmpty()) return false;
        return true;
    }

    @Override
    public void goFirst() {
        pos = 0;
    }

    @Override
    public void goLast() {
        pos = listaPujas.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if(pos > listaPujas.size() - 1 || listaPujas.isEmpty()) return false;
        return true;
    }

    @Override
    public Puja next() {
        if(pos > listaPujas.size() || listaPujas.isEmpty()) return null;
        return listaPujas.get(pos++);
    }
}
