//Producto

public class Producto {
    private String nombre;
    private double precio;
    private int existencias;

    public Producto(String nombre, double precio, int existencias) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido.");
        }

        if (existencias < 0) {
            throw new IllegalArgumentException(
                "Las existencias no pueden ser negativas."
            );
        }

        this.nombre = nombre.trim();
        setPrecio(precio);
        this.existencias = existencias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setPrecio(double precio) {
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException(
                "El precio debe ser un numero no negativo."
            );
        }

        this.precio = precio;
    }

    public void registrarEntrada(int cantidad) {
        validarCantidad(cantidad);

        if (cantidad > Integer.MAX_VALUE - existencias) {
            throw new IllegalArgumentException(
                "La entrada supera la capacidad del inventario."
            );
        }

        existencias += cantidad;
    }

    public void registrarSalida(int cantidad) {
        validarCantidad(cantidad);

        if (cantidad > existencias) {
            throw new IllegalArgumentException(
                "No hay suficientes existencias."
            );
        }

        existencias -= cantidad;
    }

    private void validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad debe ser mayor que cero."
            );
        }
    }
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
        Producto p=new Producto("Cuaderno",35,10);p.registrarEntrada(5);p.registrarSalida(3);
        comprobar(p.getExistencias()==12);rechazar(()->p.registrarSalida(13));
        rechazar(()->p.setPrecio(-1));p.setPrecio(0);comprobar(p.getPrecio()==0);
        rechazar(()->p.registrarEntrada(Integer.MAX_VALUE));comprobar(p.getExistencias()==12);
        System.out.println("Ejercicio 11: OK");
    }
}
