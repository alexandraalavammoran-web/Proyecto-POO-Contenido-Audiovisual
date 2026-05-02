package uni1a;

public class Investigador {
	private String nombre;
    private String especialidad;

    // Constructor
    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método para mostrar los datos
    public void mostrarDetalles() {
        System.out.println("Investigador: " + nombre + " - Especialidad: " + especialidad);
    }
}
