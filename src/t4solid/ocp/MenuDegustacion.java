package t4solid.ocp;

import java.util.Enumeration;
import java.util.Vector;

public class MenuDegustacion {
    Vector<IPlato> platos =new Vector<IPlato>();


    public void addPlato(IPlato plato){
        platos.add(plato);
    }

    public void avisoCocina(){
        Enumeration<IPlato> listaPlatos = platos.elements();

        IPlato plato;
        while (listaPlatos.hasMoreElements()){
            plato = listaPlatos.nextElement();
            plato.cocinar(); plato.emplatar(); plato.servir();
        }

    }
    


    public static void main(String[] args){
        MenuDegustacion menu = new MenuDegustacion();
        menu.addPlato(new PrimerPlato());
        menu.addPlato(new SegundoPlato());
        menu.addPlato(new Postre());
        menu.addPlato(new SegundoPlato());
        menu.addPlato(new Postre());

        //Nuevos entrantes
        menu.addPlato(new Entrantes());
        menu.addPlato(new Entrantes());

        menu.avisoCocina();
    }
}
