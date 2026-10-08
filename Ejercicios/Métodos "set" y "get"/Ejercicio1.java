//En la clase Producto, implementa setPrecio() para aceptar solo precios mayores que cero y getPrecio() para consultarlo

public class Producto {

    private double precio;

    public Producto(double precio) {
        setPrecio(precio);
    }

    public void setPrecio(double precio) {
        if (!Double.isFinite(precio) || precio <= 0) {
            throw new IllegalArgumentException(
                "El precio debe ser mayor que cero."
            );
        }

        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Producto producto = new Producto(150);
        producto.setPrecio(200);

        System.out.println(producto.getPrecio());
    }
}
