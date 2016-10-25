package t4solid.dip;

/**
 * Created by joseba on 25/10/2016.
 */
public class Deduccion implements DeduccionContract{

    public float calculaDeduccion(float importeFactura, float porcentajeDeduccion) {
        float importeDeduccion;

        if (importeFactura > 10000)
            importeDeduccion = (importeFactura * porcentajeDeduccion + 3) / 100;
        else
            importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;

        return importeDeduccion;

    }
}
