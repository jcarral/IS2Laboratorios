package t4patrones;

/**
 * Created by joseba on 30/10/2016.
 */
public class MailSender implements IObserver {
    Subasta subject;

    public MailSender(Subject subject){
        subject.attach(this);
        this.subject = (Subasta) subject;
    }
    @Override
    public void update() {
        Puja puja = subject.getPujaMayor();
        System.out.println("“Correo enviado a xxxx@yyy.zz”. El usuario"
                + puja.getPujador().getNombre()
                + " ha pujado por el artículo "
                + subject.getProducto()
                + "por valor de "
                + puja.getCantidad()
                + " euros.");
    }
}
