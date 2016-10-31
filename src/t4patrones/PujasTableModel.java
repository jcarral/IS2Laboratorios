package t4patrones;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by joseba on 31/10/2016.
 */
public class PujasTableModel extends AbstractTableModel {

    private String[] colNames = {"Pujador", "Cantidad"};
    private List<Puja> data;

    public PujasTableModel(ExtendedIterator it){
        super();
        this.data = iteratorToList(it);
    }

    private List iteratorToList(ExtendedIterator it){
        List<Puja> lista = new ArrayList<Puja>();
        while (it.hasNext()) {
            lista.add((Puja) it.next());
        }
        return lista;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    public String getColumnName(int col) {
        return colNames[col];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Puja puja = data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return puja.getPujador().getNombre();
            case 1:
                return puja.getCantidad();
            default:
                return null;
        }
    }
}
