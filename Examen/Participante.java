public abstract class Participante {
    protected String id;
    protected String nombre;
    protected String correo;
    protected Institucion institucion;
    private static int contadorParticipantes = 0;

    public Participante(String id, String nombre, String correo, Institucion institucion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.institucion = institucion;
        contadorParticipantes++;
    }

    public abstract void mostrarDatos();
    public abstract double calcularCuota();

    public static int getContadorParticipantes() {
        return contadorParticipantes;
    }
}
