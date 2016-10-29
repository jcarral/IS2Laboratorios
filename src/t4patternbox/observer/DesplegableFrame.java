package t4patternbox.observer;
import java.awt.*;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;


public class DesplegableFrame extends JFrame{
	Choice choice1 = new Choice();
    UnColor color;
	public DesplegableFrame(UnColor c) {
		this.setPreferredSize(new Dimension(100, 100));
		this.pack();
		color=c;
		choice1 = new Choice();
		choice1.addItem("Rojo"); 
		choice1.addItem("Blanco");
		choice1.addItem("Verde");
		choice1.addItemListener(new java.awt.event.ItemListener(){
			public void itemStateChanged(ItemEvent e) {

				color.setColor(choice1.getSelectedItem()); }

		});
		this.add(choice1);
		this.setVisible(true);
	}
	
	
}    


