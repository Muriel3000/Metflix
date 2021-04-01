import java.util.List;
import java.util.ArrayList;

public class Metflix {

   public List<Pelicula> peliculas = new ArrayList<>();
   public List<Serie> series = new ArrayList<>();
    
   //Metodo que inicializa el catalogo con pelis/series
    public void incializarCatalogo() {

        // CREAR pelicula
        Pelicula titanic;
        titanic = new Pelicula();
        // ATRIBUTOS
        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210;//3:30 hs
        // * CREAR ATRIBUTO DE OTRA CLASE
        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";
        // * AGREGAR A ATRIBUTOS DE LA PELICULA
        titanic.actores.add(actor);
        // AGREGAR A THIS METODO catalogo
        this.peliculas.add(titanic);

        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la noche";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;
        //reinstanciar la variable, Leo DiCaprio queda guardado en lista
        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);
        this.peliculas.add(batman);

        Pelicula harry = new Pelicula();
        harry.nombre = "Harry Potter y la piedra filsofal";
        harry.duracion = 152;
        harry.añoLanzamiento = 2001;
        this.peliculas.add(harry);

        Pelicula harry2 = new Pelicula();
        harry2.nombre = "Harry Potter y la cámara secreta";
        harry2.añoLanzamiento = 2002;
        harry2.duracion = 161;
        this.peliculas.add(harry2);

        actor = new Actor();
        actor.nombre = "Daniel Radcliffe";
        harry.actores.add(actor);
        harry2.actores.add(actor);
        actor = new Actor();
        actor.nombre = "Emma Watson";
        harry.actores.add(actor);
        harry2.actores.add(actor);

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        //reuso la variable otra vez
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";
        howIMetYM.actores.add(actor);
        actor = new Actor();
        actor.nombre = "Cobie Smulders";
        howIMetYM.actores.add(actor);

         Temporada temporada = new Temporada();
         temporada.numero = 1;
         howIMetYM.temporadas.add(temporada);

             Episodio episodio = new Episodio();
             episodio.nombre = "The last cigarrette";
             episodio.numero = 11;
             //Vinculo temporada con episodio
             temporada.episodios.add(episodio);

             //reuso la variable episodio
             episodio = new Episodio();
             episodio.nombre = "Definitions";
             episodio.numero = 1;
             temporada.episodios.add(episodio);

         //Creo y asigno todos los episodios a la lista de la temporada
         //Termino la temporada y recien ahi agrego la temporada a la serie
         howIMetYM.temporadas.add(temporada);

         temporada = new Temporada();
         temporada.numero = 3;

             episodio = new Episodio();
             episodio.nombre = "Wait for it";
             episodio.numero = 1;
             temporada.episodios.add(episodio);

             episodio = new Episodio();
             episodio.nombre = "Little Boys";
             episodio.numero = 4;
             temporada.episodios.add(episodio);

         howIMetYM.temporadas.add(temporada);

        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The Big Bang Theory";
        bbt.añoLanzamiento = 2007;
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";
        bbt.actores.add(actor);

         temporada = new Temporada();
         temporada.numero = 1;
             
             episodio = new Episodio();
             episodio.nombre = "Pilot";
             episodio.numero = 1;
             temporada.episodios.add(episodio);

             episodio = new Episodio();
             episodio.nombre = "The Cooper-Hofstadter Polarization";
             temporada.episodios.add(episodio);

         bbt.temporadas.add(temporada);
        
        this.series.add(bbt);
    }

    // Buscar serie
    public Serie buscarSerie(String nombreABuscar) {
        // series = | serie1 | serie2 | serie25 | serie40 |
        // foreach: sirve para recorrer listas
        // este ciclo, tiene una variable, que apunta en cada vuelta
        // a cada elemento de la lista
        // o sea la primer vez, va a apuntar a serie1, despues a serie2,
        // serie25, hasta que termina.
        for (Serie serie : this.series) {
            // pregunto si el numbre de la serie actual
            // que estoy recorriendo es la que necesito
            if ( serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie
        }
        return null; //si llegó hasta acá es porque no encontró la serie
    }

    public Pelicula buscarPelicula(String nombreABuscar2) {
        for (Pelicula pelicula : this.peliculas) 
            if (pelicula.nombre.equals(nombreABuscar2)) {
               return pelicula;
            }
        return null;
    }
}
