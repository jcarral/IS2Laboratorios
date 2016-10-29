package t4patternbox.observer;
/**
 * 
 */

/**
 * PatternBox: "Observer" implementation.
 * <ul>
 *   <li>defines an updating interface for objects that should be notified of changes in a subject.</li>
 * </ul>
 * 
 * @author <a href="mailto:dirk.ehms@patternbox.com">Dirk Ehms</a>
 * @author joniturrioz
 */
public interface Vista {

	/** 
	 * This method requests the Observer object to update itself to
	 * reconcile its state with that of the Subject object.
	 */
	public void update();

}
