package t4patternbox.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class PersonIterator implements Iterator {

    private Enumeration<Person> lista;

    public PersonIterator(Vector<Person> lista){
            this.lista = lista.elements();
    }

    @Override
    public boolean hasNext() {
        return lista.hasMoreElements();
    }

    @Override
    public Person next() {
        return lista.nextElement();
    }
}
