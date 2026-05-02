package uni1a;

public class Temporada {
	private int numero;
    private int episodios;

    // Constructor
    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    // Método para mostrar datos
    public void mostrarDetalles() {
        System.out.println("Temporada " + numero + " - Episodios: " + episodios);
    }
}
