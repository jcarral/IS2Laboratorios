package t4solid.dip;

import java.util.Date;


public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private final DeduccionContract deduccion;
    private final IvaContract iva;

    public Factura(DeduccionContract deduccion, IvaContract iva){
        this.deduccion = deduccion;
        this.iva = iva;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = deduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);
        // Calculamos el IVA
        importeIVA = iva.calculaIva(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
