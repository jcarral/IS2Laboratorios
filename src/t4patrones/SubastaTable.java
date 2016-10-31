package t4patrones;

import javafx.scene.control.Tab;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by joseba on 31/10/2016.
 */
public class SubastaTable extends JFrame {

    public SubastaTable(Subasta subasta){
        super("Lista de pujas para " + subasta.getProducto());

        this.setSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TableModel modelo = new PujasTableModel(subasta.getPujas());
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        this.getContentPane().add(scroll);
        this.setVisible(true);
    }
}
