package t4patrones;

/** .
 * Una puja representa la cantidad de dinero que ofrece un usuario por el producto de una subasta.
 *
 */
public class Puja {
    private final Usuario pujador;
    private final double cantidad;

    public Puja(Usuario pujador, double cantidad) {
        this.pujador = pujador;
        this.cantidad = cantidad;
    }

    public Usuario getPujador() {
        return pujador;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return getClass().getName() + " [pujador=" + pujador.getNombre()
                + ", cantidad=" + cantidad
                + "]";
    }


}

