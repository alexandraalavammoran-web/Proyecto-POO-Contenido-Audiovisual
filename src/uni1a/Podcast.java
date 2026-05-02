package uni1a;
import java.util.ArrayList;

// Clase Podcast que hereda de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {

    private String plataforma;
    private int numeroEpisodios;

    // Lista de investigadores (relación de agregación)
    private ArrayList<Investigador> investigadores = new ArrayList<>();

    // Constructor
    public Podcast(String titulo, int duracionEnMinutos, String genero, String plataforma, int numeroEpisodios) {
        super(titulo, duracionEnMinutos, genero); // 🔥 ahora sí funciona
        this.plataforma = plataforma;
        this.numeroEpisodios = numeroEpisodios;
    }

    // Método para agregar investigadores
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    // Método sobrescrito
    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Número de episodios: " + numeroEpisodios);

        System.out.println("Investigadores:");
        for (Investigador investigador : investigadores) {
            investigador.mostrarDetalles();
        }

        System.out.println();
    }
}
