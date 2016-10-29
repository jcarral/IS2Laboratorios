package t4patternbox.observer;
import javax.swing.JFrame;
import java.awt.*;

/**
 * 
 */

/**
 * PatternBox: "ConcreteObserver" implementation.
 * <ul>
 *   <li>maintains a reference to a ConcreteSubject object.</li>
 *   <li>stores state that should stay consistent with the subject's. </li>
 *   <li>implements the Observer updating interface to keep its state consistent with the subject's.</li>
 * </ul>
 * 
 * @author <a href="mailto:dirk.ehms@patternbox.com">Dirk Ehms</a>
 * @author joniturrioz
 */
public class PantallaColor extends JFrame implements Vista {

	/** stores the state of the ConcreteObserver */
	private State fObserverState;
	/** stores the associated ConcreteSubject */
	private final UnColor fConcreteSubject;
	
	/** 
	 * Constructor
	 */
/*public static void main(String args[]){
		
		Color1 modelo=new Color1();
		Vista pc=new PantallaColor(modelo);
		modelo.attach(pc);
		modelo.setColor("Rojo");
	   

		
	}*/
	public PantallaColor(UnColor subject) {
		super();
		this.setPreferredSize(new Dimension(100, 100));
		this.pack();
		fConcreteSubject = subject;
		subject.attach(this);
		// copy initial state
		//fObserverState = fConcreteSubject.getState();
		setVisible(true);
	}

	/** 
	 * This method updates the ConcreteObserver's state to be consistent
	 * with the ConcreteSubject's state.
	 */
	public void update() {
		// TODO: Customize this method based on your application needs.
		fConcreteSubject.getColor();
		System.out.println("Se ejecuta");
		// TODO: Customize this method based on your application needs.
		String color = fConcreteSubject.getColor();
		System.out.println("Se ejecuta"+color);
		if (color.compareTo("Rojo")==0) this.getContentPane().setBackground(Color.RED);
		
		else if (color.compareTo("Blanco")==0) this.getContentPane().setBackground(Color.WHITE);
		else if (color.compareTo("Verde")==0) this.getContentPane().setBackground(Color.GREEN);
		repaint();
		System.out.println("fin");

	}

}
