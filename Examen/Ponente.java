public class Ponente extends Participante {

    private String tema;

    public Ponente(String id, String nombre, String correo, Institucion institucion, String tema) {
        super(id, nombre, correo, institucion);
        this.tema = tema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Institución: " + institucion.getNombre());
        System.out.println("Ciudad: " + institucion.getCiudad());
        System.out.println("Tipo: Ponente");
        System.out.println("Tema: " + tema);
    }

    @Override
    public double calcularCuota() {
        return 500.00;
    }
    
}
