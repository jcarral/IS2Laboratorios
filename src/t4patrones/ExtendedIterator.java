package t4patrones;

import java.util.Iterator;

/**
 * Created by joseba on 29/10/2016.
 */
public interface ExtendedIterator<T> extends Iterator<T> {

    T previous();
    boolean hasPrevious();
    void goFirst();
    void goLast();
}
