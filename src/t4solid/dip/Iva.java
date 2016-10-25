package t4solid.dip;

/**
 * Created by joseba on 25/10/2016.
 */

public class Iva implements IvaContract{
    private static final double IVA = 0.18;
    public  float calculaIva(float importe){
        return (float) (importe * IVA);
    }
}
