package uni1a;

public class Actor {
	 private String nombre;
	    private int edad;
	    private String nacionalidad;
	   // El constructor que inicializa los datos del actor
	    public Actor(String nombre, int edad, String nacionalidad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.nacionalidad = nacionalidad;
	    }
	    // Método que muestra la información del actor
	    public void mostrarDetalles() {
	        System.out.println("Actor: " + nombre + ", Edad: " + edad + ", Nacionalidad: " + nacionalidad);
	    }
}
