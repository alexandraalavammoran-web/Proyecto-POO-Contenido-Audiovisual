package uni1a;
import java.util.ArrayList;

// Clase Streaming que hereda de ContenidoAudiovisual
public class Streaming extends ContenidoAudiovisual {

    private String plataforma;
    private boolean enVivo;

    // Lista de actores asociados al streaming (relación de agregación)
    private ArrayList<Actor> actores = new ArrayList<>();

    // Constructor que inicializa los datos del streaming
    public Streaming(String titulo, int duracionEnMinutos, String genero, String plataforma, boolean enVivo) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.enVivo = enVivo;
    }

    // Método para agregar actores al streaming
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    // Método que muestra toda la información del streaming
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del streaming:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("En vivo: " + enVivo);

        System.out.println("Actores:");
        for (Actor actor : actores) {
            actor.mostrarDetalles();
        }

        System.out.println();
    }
}



