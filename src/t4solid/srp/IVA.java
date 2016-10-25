package t4solid.srp;

/**
 * Created by joseba on 18/10/16.
 */
public class IVA {

    private static final double IVA = 0.18;
    public static float calcularIva(float importe){
        return (float) (importe * IVA);
    }
}
