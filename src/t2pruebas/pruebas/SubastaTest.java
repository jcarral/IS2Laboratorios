package t2pruebas.pruebas;

import org.junit.Test;
import t2pruebas.subastas.Subasta;
import t2pruebas.subastas.Usuario;

import java.time.LocalDate;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertFalse;


/**
 * Práctica realizada por Joseba Carral, Miriam Schneider y Héctor López
 */
public class SubastaTest {

    @Test
    public void subastaExceptionProducto() {
        try{
            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            new Subasta(null, juan);
            fail("El producto no puede ser nulo o vacio, Error!");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void subastaExceptionProductoVacio() {
        try{
            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            new Subasta("", juan);
            fail("El producto no puede ser nulo o vacio, Error!");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void subastaExceptionUsuario(){
        try{
            new Subasta("Cerveza", null);
            fail("El usuario no puede ser nulo, Error!!");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void subastaTest(){
        Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
        try{
            new Subasta("Cerveza", juan);
            assertTrue(true);

        }catch(Exception e){
            fail("No deberÌa saltar una excepciÛn si has metido los datos bien");
        }

    }


    @Test
    public void pujarTest(){
        Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
        Usuario pedro = new Usuario ("Pedro", "perico@hotmail.com", LocalDate.of(1979, 6, 9), 150);
        Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);
        Subasta subasta = new Subasta("Cerveza", juan);

        subasta.pujar(enrique);
        boolean resultado = subasta.pujar(pedro);
        assertTrue(resultado);
    }

    @Test
    public void pujaSobrecargadaTestExcUser(){
        try{
            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            new Subasta("Cerveza", juan).pujar(null, 3.5);
            fail("Una puja la debe de hacer un usuario");

        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void pujaSobrecargadaTestExcCant(){
        try{
            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);

            new Subasta("Cerveza", enrique).pujar(juan, 0.5);
            fail("Una puja no puede ser inferior a 1");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void pujaSobrecargada(){

        try{

            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);

            boolean resultado = new Subasta("Cerveza", enrique).pujar(juan, 80.5);
            assertTrue(resultado);
        }catch(Exception e){
            fail("La puja no debe de dar errores");
        }
    }

    @Test
    public void pujaSobrecargadaCantidadInferior(){

        try{

            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 10);
            Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);

            boolean resultado = new Subasta("Cerveza", enrique).pujar(juan, 18.5);
            assertFalse(resultado);
        }catch(Exception e){
            fail("La puja no debe de dar errores");
        }
    }

    @Test
    public void testEjecutarCerrarSubasta(){
        try{

            Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
            Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);

            Subasta subasta = new Subasta("Cerveza", enrique);
            subasta.pujar(juan, 18.5);
            subasta.ejecutar();

            assertFalse(subasta.isAbierta());

        }catch(Exception e){
            fail("La puja no debe de dar errores, la puja debe estar cerrada");
        }
    }


    @Test
    public void testEjecutarSubastaSinPujas(){
        try{

            Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);
            Subasta subasta = new Subasta("Cerveza", enrique);
            subasta.ejecutar();

            assertTrue(subasta.isAbierta());

        }catch(Exception e){
            fail("La puja no debe de dar errores, debe seguir abierta la subasta porque no se puede cerrar");
        }
    }

    @Test
    public void testGetters(){
        Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);

        Subasta subasta = new Subasta("Cerveza", enrique);
        if(!subasta.getProducto().equals("Cerveza")
                || !subasta.getPropietario().equals(enrique)
                || !subasta.getPujas().isEmpty()
                || !subasta.isAbierta()){
            fail("Los getters no devuelven los valores correctos");
        }else{
            String esperado = "subastas.Subasta [producto=Cerveza, propietario=Enrique, abierta=true, pujas=0]";
            assertEquals(esperado, subasta.toString());
        }
    }


}
