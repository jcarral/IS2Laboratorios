package t4patternbox.observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

/**
 * PatternBox: "Subject" implementation.
 * <ul>
 *   <li>knows its observers. Any number of Observer objects may observe a subject.</li>
 *   <li>provides an interface for attaching and detaching Observer objects.</li>
 * </ul>
 * 
 * @author <a href="mailto:dirk.ehms@patternbox.com">Dirk Ehms</a>
 * @author joniturrioz
 */
public class Modelo {

	/** This list stores references to all Observer instances. */
	private List fObserverList = new ArrayList();

	/** 
	 * This method attaches an Observer instance to the Subject instance.
	 */
	public void attach(Vista observer) {
		fObserverList.add(observer);
	}

	/** 
	 * This method detaches an Observer instance from the Subject instance.
	 */
	public void detach(Vista observer) {
		fObserverList.remove(observer);
	}

	/** 
	 * This method notifies the Subject instances that a change has been observed.
	 */
	public void toNotify() {

		Iterator it = fObserverList.iterator();

		// for each registered observer call the 'update'-method
		while (it.hasNext()) {
			((Vista) it.next()).update();
		} // while

	}

}
