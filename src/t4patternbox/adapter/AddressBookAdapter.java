package t4patternbox.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by joseba on 26/10/2016.
 */
public class AddressBookAdapter implements Iterator{

    Enumeration<Person> lista;
    public AddressBookAdapter(AddressBook ab){
        loadEnumeration(ab);
    }

    private void loadEnumeration(AddressBook ab){
        int size = ab.getSize();
        Vector<Person> vPersons = new Vector<>();

        for (int i = 0; i < size; i++) {
           vPersons.add(ab.getPerson(i));
        }

        lista = vPersons.elements();
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
