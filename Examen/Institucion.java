public class Institucion {
    private String siglas;
    private String nombre;
    private String ciudad;

    public Institucion(String siglas, String nombre, String ciudad) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }


    
    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
