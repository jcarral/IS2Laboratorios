package t4patternbox.adapter;

import java.util.Iterator;

/**
 * Created by joseba on 26/10/2016.
 */
public class MainABAdapter {
    public static void main(String[] args){

        Iterator<Person> itr = Sorting.sortedIterator(new AddressBookAdapter(new AddressBook()), new PersonNameComparator());
        Iterator<Person> itr2 = Sorting.sortedIterator(new AddressBookAdapter(new AddressBook()), new PersonCityComparator());

        while (itr.hasNext()){
            System.out.println("Nombre: " + itr.next().getNombre());
        }
        while (itr2.hasNext()){
            System.out.println("Ciudad: " + itr2.next().getCiudad());
        }
    }
}
