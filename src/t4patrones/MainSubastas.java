package t4patrones;

import java.time.LocalDate;

/**
 * Created by joseba on 29/10/2016.
 */
public class MainSubastas {
    public static void main(String[] args){

        Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
        Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);
        Usuario pedro = new Usuario ("Pedro", "perico@hotmail.com", LocalDate.of(1979, 6, 9), 150);

        Subasta subasta = new Subasta("Cerveza", pedro);
        new MailSender(subasta);
        subasta.pujar(enrique);
        subasta.pujar(juan);
        subasta.pujar(enrique);
        subasta.pujar(juan);
        subasta.pujar(enrique);
        subasta.pujar(juan);
        subasta.pujar(enrique);

        ExtendedIterator<Puja> it = subasta.getPujas();

        Puja p;
        it.goLast();
        System.out.println("Orden inverso:");
        while (it.hasPrevious()){
            p=it.previous();
            System.out.println("Puja actual: " + p.toString());
        }

        System.out.println("\nOrden normal:");
        it.goFirst();
        while (it.hasNext()){
            p=it.next();
            System.out.println("Puja actual: " + p.toString());
        }
    }
}
