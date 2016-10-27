package t4patternbox.factory;

import java.awt.Frame;
import javax.swing.JTextArea;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Pantalla extends Frame {
    private static final long serialVersionUID = 1L;
    private JTextArea jTextArea = null;
    private JButton jButton = null;
    private JButton jButton2 = null;
    private JButton jButton3 = null;
    private JButton jButtonBig = null;



    /**
     * This is the default constructor
     */
    public Pantalla() {
        super();
        initialize();
    }




    public static void main(String args[]){
        Pantalla p=new Pantalla();
        p.setVisible(true);
    }
    /**
     * This method initializes this
     *
     * @return void
     */
    private void initialize() {
        this.setLayout(null);
        this.setSize(300, 200);
        this.setTitle("Frame");

        this.add(getJTextArea(), null);
        this.add(getJButton(), null);
        this.add(getJButton2(), null);
        this.add(getJButton3(), null);
        this.add(getJButtonBig(), null);


    }

    /**
     * This method initializes jTextArea
     *
     * @return javax.swing.JTextArea
     */
    private JTextArea getJTextArea() {
        if (jTextArea == null) {
            jTextArea = new JTextArea();
            jTextArea.setText(("pulsa el bot�n"));
            jTextArea.setBounds(new Rectangle(17, 43, 145, 84));
        }
        return jTextArea;
    }

    /**
     * This method initializes jButton
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            IFontStyle f=FontFactory.createFont(1);
            jButton.setFont(f.getFont());
            jButton.setText("B");
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    jTextArea.setFont(FontFactory.createFont(1).getFont());
                }
            });
            jButton.setBounds(new Rectangle(195, 31, 65, 43));
        }
        return jButton;
    }
    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            IFontStyle f=FontFactory.createFont(2);
            jButton2.setFont(f.getFont());
            jButton2.setText("I");
            jButton2.addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent arg0) {
                    jTextArea.setFont(FontFactory.createFont(2).getFont());
                }
            });
            jButton2.setBounds(new Rectangle(195, 71, 65, 43));
        }
        return jButton2;
    }
    private JButton getJButton3() {
        if (jButton3 == null) {
            jButton3 = new JButton();
            IFontStyle f=FontFactory.createFont(3);
            jButton3.setFont(f.getFont());
            jButton3.setText("P");
            jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    jTextArea.setFont(FontFactory.createFont(3).getFont());
                }
            });
            jButton3.setBounds(new Rectangle(195, 111, 65, 43));
        }
        return jButton3;
    }

    private JButton getJButtonBig(){
        if(jButtonBig == null){
            jButtonBig = new JButton();
            jButtonBig.setText("G");
            IFontStyle f = FontFactory.createFont(4);
            jButtonBig.setFont(f.getFont());
            jButtonBig.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    jTextArea.setFont(FontFactory.createFont(4).getFont());
                }
            });
            jButtonBig.setBounds(new Rectangle(195, 151, 65, 43));

        }
        return jButtonBig;
    }

}

