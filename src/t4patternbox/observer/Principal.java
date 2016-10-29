package t4patternbox.observer;

public class Principal {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            crearPantallas();
        }
    }

    private static void crearPantallas(){
        UnColor modelo = new UnColor();
        new PantallaColor(modelo);
        new PantallaTexto(modelo);
        new DesplegableFrame(modelo);
    }
}
