package uni1a;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
 // Lista de temporadas asociadas a la serie (RELACIÓN DE COMPOSICIÓN)
    private ArrayList<Temporada> listatemporadas = new ArrayList<>();
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void agregarTemporada(Temporada temporada){
        listatemporadas.add(temporada);
        }
        // Método sobrescrito para mostrar los detalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Lista de temporadas:");
        for (Temporada t : listatemporadas){
         t.mostrarDetalles();
    }
        System.out.println();
    }
}