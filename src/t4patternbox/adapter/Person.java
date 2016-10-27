package t4patternbox.adapter;

/**
 * Created by joseba on 26/10/2016.
 */
public class Person {

    private String nombre;
    private String ciudad;


    public Person(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
