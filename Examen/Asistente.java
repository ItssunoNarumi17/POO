public class Asistente extends Participante {

    private boolean esEstudiante;

    public Asistente(String id, String nombre, String correo, Institucion institucion, boolean esEstudiante) {
        super(id, nombre, correo, institucion);
        this.esEstudiante = esEstudiante;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Institución: " + institucion.getNombre());
        System.out.println("Ciudad: " + institucion.getCiudad());
        System.out.println("Tipo: Asistente");
        System.out.println("Es estudiante: " + (esEstudiante ? "Sí" : "No"));
    }

    @Override
    public double calcularCuota() {
        return esEstudiante ? 700.00 : 1000.00;
    }
    
}
