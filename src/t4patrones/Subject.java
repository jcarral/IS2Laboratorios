package t4patrones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by joseba on 30/10/2016.
 */
public class Subject {
    private List observerList = new ArrayList();

    public void attach(IObserver observer) {
        observerList.add(observer);
    }
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }
    public void toNotify() {

        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            ((IObserver) it.next()).update();
        }

    }
}
