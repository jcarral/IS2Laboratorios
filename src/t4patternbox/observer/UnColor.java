package t4patternbox.observer;

/**
 * PatternBox: "ConcreteSubject" implementation.
 * <ul>
 *   <li>stores state of interest to ConcreteObserver objects.</li>
 *   <li>sends a notification to its observers when its state changes.</li>
 * </ul>
 * 
 * @author <a href="mailto:dirk.ehms@patternbox.com">Dirk Ehms</a>
 * @author onekin
 */
public class UnColor extends Modelo {

	String color;
	/** stores the state of the ConcreteSubject */
	private State fSubjectState;

	/** 
	 * This method returns the state of the ConcreteSubject instance.
	 */
	public State getState() {
		return fSubjectState;
	}

	/** 
	 * This method sets the state of the ConcreteSubject instance.
	 */
	public void setState(State state) {
		fSubjectState = state;
	}

	public void setColor(String color){
		this.color=color;
		toNotify();
	}

	public String getColor(){
		return color;
	}

}
