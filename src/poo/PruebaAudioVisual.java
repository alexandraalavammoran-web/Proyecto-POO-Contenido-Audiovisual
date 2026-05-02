package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Clase principal donde se prueban las relaciones entre objetos
        // Se aplican conceptos de herencia, agregación y composición
        // Arreglo que almacena distintos tipos de contenido audiovisual(polimorfismo)
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        Pelicula peli = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington", 47, "Australia");
        Actor actor2 = new Actor("Zoe Saldana", 45, "Estados Unidos");
        // Relación de agregación: se asocian actores a la película
         peli.agregarActor(actor1);
         peli.agregarActor(actor2);
         contenidos[0] = peli;
         
      // Creación de una serie y sus temporadas (relación de composición)
         SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
         Temporada t1 = new Temporada(1, 10);
         Temporada t2 = new Temporada(2, 10);
         
         serie.agregarTemporada(t1);
         serie.agregarTemporada(t2);
         contenidos[1] = serie;
         
         // Creación de un documental y asociación de investigadores (agregación)
        Documental doc = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador i1 = new Investigador("Carl Sagan", "Astrofisica");
        Investigador i2 = new Investigador("Neil Tyson", "Cosmologia");

        doc.agregarInvestigador(i1);
        doc.agregarInvestigador(i2);
        contenidos[2] = doc;
        
     // Creación de nuevas subclases (Podcast y Streaming) y sus relaciones con clases existentes
     // Se establece una relación de agregación con Investigador
        Podcast podcast = new Podcast("Hablemos de la salud", 40, "Educativo", "Spotify", 12);
        Investigador invPodcast = new Investigador("Ana Torres", "Comunicación en salud");
        podcast.agregarInvestigador(invPodcast);
        contenidos[3] = podcast;
        
     // Se establece una relación de agregación con Actor
        Streaming streaming = new Streaming("Entrevista en vivo", 90, "Entretenimiento", "Twitch", true);
        Actor actorStreaming = new Actor("Cristina Alava", 21, "Ecuador");
        streaming.agregarActor(actorStreaming);
        contenidos[4] = streaming;
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}