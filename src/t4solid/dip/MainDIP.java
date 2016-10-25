package t4solid.dip;

/**
 * Created by joseba on 25/10/2016.
 */
public class MainDIP {
    public static void main(String[] args){
        Factura f1 = new Factura(new Deduccion(), new Iva());
        Factura f2 = new Factura(new Deduccion(), new Iva16());

        f1.calcularTotal();
        f2.calcularTotal();

        System.out.println("Resultado de la factura con un IVA del 18%: " + f1.importeTotal);
        System.out.println("Resultado de la factura con un IVA del 16%: " + f2.importeTotal);
    }
}
