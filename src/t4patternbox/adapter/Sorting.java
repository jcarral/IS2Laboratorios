package t4patternbox.adapter;

import java.util.*;


public class Sorting {
    public static Iterator sortedIterator(Iterator it, Comparator comparator) {
        List list = new ArrayList();
        while (it.hasNext()) {
            list.add(it.next());
        }
        Collections.sort(list, comparator);
        return list.iterator();
    }
}
