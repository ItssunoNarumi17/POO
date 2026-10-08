//En una clase Playlist

public class Playlist {
    private double duracionTotalMinutos;

    public Playlist(double duracionTotalMinutos) {
        if (!Double.isFinite(duracionTotalMinutos)
                || duracionTotalMinutos < 0) {
            throw new IllegalArgumentException("Duracion invalida.");
        }

        this.duracionTotalMinutos = duracionTotalMinutos;
    }

    public void eliminarCancion(double minutos) {
        if (!Double.isFinite(minutos) || minutos <= 0) {
            throw new IllegalArgumentException(
                "Los minutos deben ser positivos."
            );
        }

        if (minutos > duracionTotalMinutos) {
            throw new IllegalArgumentException(
                "La duracion supera el total de la playlist."
            );
        }

        duracionTotalMinutos -= minutos;
    }

    public double getDuracionTotalMinutos() {
        return duracionTotalMinutos;
    }
}

//

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(20);

        // Caso 1: eliminacion valida.
        playlist.eliminarCancion(4);
        System.out.println(
            "Duracion restante: " + playlist.getDuracionTotalMinutos()
        );

        // Caso 2: eliminacion invalida.
        try {
            playlist.eliminarCancion(30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
