package t4solid.srp;

import java.util.Date;

/**
 * Created by joseba on 18/10/16.
 */
public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;

    // Método que calcula el total de la factura
    public void calcularTotal() {
        importeDeduccion = ImporteDeduccion.calcularImporte(importeFactura);
        if(codigo.equals("0"))
            importeIVA = IVA.calcularIva(importeFactura);
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
