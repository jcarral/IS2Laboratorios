package t4solid.srp;

/**
 * Created by joseba on 18/10/16.
 */
public class ImporteDeduccion {

    private static final float porcentajeDeduccion = 18;

    public static float calcularImporte(float importeFactura) {
        float importeDeduccion;

        if (importeFactura > 10000)
            importeDeduccion = (importeFactura * porcentajeDeduccion + 3) / 100;
        else
            importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;

        return importeDeduccion;

    }
}
