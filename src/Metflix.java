import java.util.List;
import java.util.ArrayList;

public class Metflix {

   public List<Pelicula> peliculas = new ArrayList<>();
   public List<Serie> series = new ArrayList<>();
    
   //Metodo que inicializa el catalogo con pelis/series
    public void inicializarCatalogo() {

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
        titanic.director = new Director();
        titanic.director.nombre = "James Cameron";
        this.peliculas.add(titanic);

        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la noche";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;
        //reinstanciar la variable, Leo DiCaprio queda guardado en lista
        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);
        batman.director = new Director();
        batman.director.nombre = "Christopher Nolan";
        this.peliculas.add(batman);

        Pelicula elResplandor = new Pelicula();
        elResplandor.nombre ="El Resplandor";
        elResplandor.director = new Director();
        elResplandor.director.nombre = "Stanley Kubrick";
        this.peliculas.add(elResplandor);

        Pelicula harry = new Pelicula();
        harry.nombre = "Harry Potter y la piedra filosofal";
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

        Pelicula network = new Pelicula();
        network.nombre = "The social network";
        network.añoLanzamiento = 2010;
        network.director = new Director();
        network.director.nombre = "David Fincher";
        this.peliculas.add(network);

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

             Websodio ws = new Websodio();
             ws.nombre = "Nombre websodio en internet";
             ws.numero = 35;
             ws.link = "http://miepisodios.com/websodio.avi";
             temporada.episodios.add(ws);

         //Creo y asigno todos los episodios a la lista de la temporada
         //Termino la temporada y recien ahi agrego la temporada a la serie
         howIMetYM.temporadas.add(temporada);

         temporada = new Temporada();
         temporada.numero = 3;

             episodio = new Episodio();
             episodio.nombre = "Wait for it";
             episodio.numero = 1;
             episodio.director = new Director();
             episodio.director.nombre = "Pamela Fryman";
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

        Serie house = new Serie();
        house.nombre = "House of Cards";
         
         temporada = new Temporada();
         temporada.numero = 1;
             episodio = new Episodio();
             episodio.numero = 1;
             episodio.nombre = "Chapter 1";
             episodio.director = new Director();
             episodio.director.nombre = "David Fincher";
             temporada.episodios.add(episodio);

         house.temporadas.add(temporada);

        this.series.add(house);

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

    public Serie buscarSerieV2(String nombreABuscar){
        Serie serieBuscada = null;
        //En este caso se recorre TODO, aunque haya mil series
        //y al final se devuelve si encontro una serie
        //En el caso anterior, se devuelve apenas se encuentra
        //ej: si hay 1000 series pero esta en la posicion 3, hace solo 3 vueltas
        for (Serie serie : this.series) {
            if (serie.nombre.equals(nombreABuscar))
                serieBuscada = serie; 
        }
        return serieBuscada;
    }
        /*
        if (serieBuscada == null)
            return null;
        else
            return serieBuscada;
        */

    public Pelicula buscarPelicula(String nombreABuscar2) {
        for (Pelicula pelicula : this.peliculas) 
            if (pelicula.nombre.equals(nombreABuscar2)) {
               return pelicula;
            }
        return null;
    }

    public void buscarDirector(String nombreDirector) {
        
        for (Pelicula pelicula : this.peliculas) { 
            if(pelicula.director.nombre.equals(nombreDirector)) 
            //todas las peliculas tienen director, por eso no hace falta != null
                 System.out.println("Pelicula " + pelicula.nombre);
        }

        for (Serie serie: this.series) { 
            for (Temporada temporada : serie.temporadas) 
                for (Episodio episodio : temporada.episodios) 
                    if (episodio.director != null && episodio.director.nombre.equals(nombreDirector)) 
                         System.out.println("Episodio " + episodio.nombre 
                         + ", de la serie " + serie.nombre + ", temporada " + temporada.numero ); 
        }
    }
}
