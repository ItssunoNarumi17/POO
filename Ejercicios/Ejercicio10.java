//Ejercicio 10

public class Expediente {
    private String diagnostico;
    String folioInterno;
    protected int prioridad;
    private String ultimaNota;
    public Expediente(String diagnostico){this.diagnostico=diagnostico;}
    public void registrarNota(String nota){
        if(!notaValida(nota))throw new IllegalArgumentException("Nota invalida");ultimaNota=nota.trim();
    }
    private boolean notaValida(String nota){return nota!=null&&!nota.trim().isEmpty();}
    public boolean tieneDiagnostico(){return diagnostico!=null&&!diagnostico.trim().isEmpty();}
    public String getUltimaNota(){return ultimaNota;}
}

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
        Expediente e=new Expediente("Diagnostico reservado");e.folioInterno="F1";e.prioridad=1;
        e.registrarNota("Nota de seguimiento");comprobar(e.tieneDiagnostico());
        rechazar(()->e.registrarNota(" "));
        System.out.println("Ejercicio 10: OK");
    }
}
