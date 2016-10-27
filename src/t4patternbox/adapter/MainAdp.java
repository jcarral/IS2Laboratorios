package t4patternbox.adapter;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by joseba on 26/10/2016.
 */
public class MainAdp {
    public static void main(String[] args){

        Vector<Person> listaPersonas = new Vector();
        listaPersonas.add(new Person("Jon", "Donostia"));
        listaPersonas.add(new Person("Ane", "Irun"));
        listaPersonas.add(new Person("Izaskun", "Tolosa"));
        listaPersonas.add(new Person("Mikel", "Hernani"));

        Iterator<Person> itr = Sorting.sortedIterator(new PersonIterator(listaPersonas), new PersonNameComparator());
        while (itr.hasNext()){
            System.out.println("Nombre: " + itr.next().getNombre());
        }

        Iterator<Person> itr2 = Sorting.sortedIterator(new PersonIterator(listaPersonas), new PersonCityComparator());

        while (itr2.hasNext()){
            System.out.println("Ciudad: " + itr2.next().getCiudad());
        }

    }
}
