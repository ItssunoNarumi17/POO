//Diseña una clase VehiculosElectronico para una aplicacion.

public class VehiculoElectrico {
    public enum ModoConduccion {
        ECO, NORMAL, DEPORTIVO
    }

    private double porcentajeBateria;
    private double velocidadKmh;
    private String modelo;
    private ModoConduccion modoConduccion;
}
