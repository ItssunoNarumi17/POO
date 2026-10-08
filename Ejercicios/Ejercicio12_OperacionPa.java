//

public class Prueba {
    private static void comprobar(boolean condicion) {
        if (!condicion) throw new AssertionError("Resultado incorrecto");
    }
    private static void rechazar(Runnable accion) {
        try { accion.run(); }
        catch (IllegalArgumentException | IllegalStateException e) { return; }
        throw new AssertionError("Se acepto un valor u operacion invalida");
    }
    public static void main(String[] args) {
        Patrulla p=new Patrulla();p.prueba();comprobar(p.getVelocidad()==60);System.out.println(p.getVelocidad());
        System.out.println("Ejercicio 12: OK");
    }
}
