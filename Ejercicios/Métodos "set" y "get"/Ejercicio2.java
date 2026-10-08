//En la clase CuentaUsuario, delcara correo y contraseña. Decide que getters y setters deben existir y justifica tu decisión

public class CuentaUsuario {
    private String correo;
    private String contrasena;

    public CuentaUsuario(String correo, String contrasena) {
        setCorreo(correo);
        setContrasena(contrasena);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()
                || !correo.contains("@")) {
            throw new IllegalArgumentException("Correo invalido.");
        }

        this.correo = correo.trim();
    }

    public void setContrasena(String contrasena) {
        if (contrasena == null || contrasena.length() < 8) {
            throw new IllegalArgumentException(
                "La contrasena debe tener al menos 8 caracteres."
            );
        }

        this.contrasena = contrasena;
    }
}
