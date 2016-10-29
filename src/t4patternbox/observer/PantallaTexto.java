package t4patternbox.observer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by joseba on 29/10/2016.
 */
public class PantallaTexto extends JFrame implements Vista {

    private UnColor color;
    private JTextField text;

    public PantallaTexto(UnColor color){
        this.color = color;
        this.color.attach(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(100, 100));
        this.pack();
        this.setLocationRelativeTo(null);
        this.add(addText());
        this.setVisible(true);

    }

    private JTextField addText(){
        if(text == null){
            text = new JTextField("No hay ningún color seleccionado");
        }
        return text;
    }


    @Override
    public void update() {
        String newColor = color.getColor();
        text.setText("El color actual es: " + newColor);
    }
}
