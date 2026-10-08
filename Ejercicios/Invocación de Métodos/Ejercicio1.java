//Crea una clase Carrito con agregarProducto(double precio) y clalcularTotal()

public class Carrito {
    private double total;

    public void agregarProducto(double precio) {
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException("Precio invalido.");
        }

        total += precio;
    }

    public double calcularTotal() {
        return total;
    }
}

//

public class PruebaCarrito {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        carrito.agregarProducto(100);
        carrito.agregarProducto(50.50);

        System.out.println("Total: " + carrito.calcularTotal());
    }
}
