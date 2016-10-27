package t4patternbox.adapter;

import java.util.Comparator;

/**
 * Created by joseba on 26/10/2016.
 */
public class PersonCityComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getCiudad().compareTo(o2.getCiudad());
    }
}
