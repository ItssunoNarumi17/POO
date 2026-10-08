//Diseña una clase SensorTemperatura

public class SensorTemperatura {
    private double temperatura;
    private boolean tieneLectura;

    public void registrarLectura(double temperatura) {
        if (!Double.isFinite(temperatura)) {
            throw new IllegalArgumentException("Lectura invalida.");
        }

        this.temperatura = temperatura;
        tieneLectura = true;
    }

    public void mostrarEstado() {
        if (!tieneLectura) {
            System.out.println("Sin lecturas registradas.");
            return;
        }

        System.out.println("Temperatura: " + temperatura + " C");
    }
}

//

```java
public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        sensor.registrarLectura(26.5);
        sensor.mostrarEstado();
    }
}
