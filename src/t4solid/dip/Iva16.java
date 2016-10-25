package t4solid.dip;

/**
 * Created by joseba on 25/10/2016.
 */
public class Iva16 implements IvaContract{
    private static final double IVA = 0.16;
    public  float calculaIva(float importe){
        return (float) (importe * IVA);
    }
}

