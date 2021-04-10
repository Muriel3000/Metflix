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
        titanic.setNombre("Titanic");
        titanic.setAñoLanzamiento(1997);
        titanic.setDuracion(210);//3:30 hs
        // * CREAR ATRIBUTO DE OTRA CLASE
        Actor actor = new Actor();
        actor.setNombre("Leo DiCaprio");
        // * AGREGAR A ATRIBUTOS DE LA PELICULA
        titanic.getActores().add(actor);
        // AGREGAR A THIS METODO catalogo
        titanic.setDirector(new Director());
        titanic.getDirector().setNombre("James Cameron");
        this.peliculas.add(titanic);

        Pelicula batman = new Pelicula();
        batman.setNombre("Batman: el caballero de la noche");
        batman.setAñoLanzamiento(2008);
        batman.setDuracion(152);
        //reinstanciar la variable, Leo DiCaprio queda guardado en lista
        actor = new Actor();
        actor.setNombre("Christian Bale");
        batman.getActores().add(actor);
        batman.setDirector(new Director());
        batman.getDirector().setNombre("Christopher Nolan");
        this.peliculas.add(batman);

        Pelicula elResplandor = new Pelicula();
        elResplandor.setNombre("El Resplandor");
        elResplandor.setDirector(new Director());
        elResplandor.getDirector().setNombre("Stanley Kubrick");
        this.peliculas.add(elResplandor);

        Pelicula harry = new Pelicula();
        harry.setNombre("Harry Potter y la piedra filosofal");
        harry.setDuracion(152);
        harry.setAñoLanzamiento(2001);
       
        Pelicula harry2 = new Pelicula();
        harry2.setNombre("Harry Potter y la cámara secreta");
        harry2.setAñoLanzamiento(2002);
        harry2.setDuracion(161);

        actor = new Actor();
        actor.setNombre("Daniel Radcliffe");
        harry.getActores().add(actor);
        harry2.getActores().add(actor);
        actor = new Actor();
        actor.setNombre("Emma Watson");
        harry.getActores().add(actor);
        harry2.getActores().add(actor);
        this.peliculas.add(harry);
        this.peliculas.add(harry2);

        Pelicula network = new Pelicula();
        network.setNombre("The social network");
        network.setAñoLanzamiento(2010);
        network.setDirector(new Director());
        network.getDirector().setNombre("David Fincher");
        this.peliculas.add(network);

        Serie howIMetYM = new Serie();
        howIMetYM.setNombre("How I met your mother");
        howIMetYM.setAñoLanzamiento(2005);
        //reuso la variable otra vez
        actor = new Actor();
        actor.setNombre("Neil Patrick Harris");
        howIMetYM.getActores().add(actor);
        actor = new Actor();
        actor.setNombre("Cobie Smulders");
        howIMetYM.getActores().add(actor);

         Temporada temporada = new Temporada();
         temporada.setNumero(1);
         howIMetYM.getTemporadas().add(temporada);

             Episodio episodio = new Episodio(11, "The last cigarrette");
             //Uso el constructor de Episodio 
             temporada.getEpisodios().add(episodio);
             //Vinculo temporada con episodio
             //reuso la variable episodio

             episodio = new Episodio(1, "Definitions");
             temporada.getEpisodios().add(episodio);

             Websodio ws = new Websodio(35, "Nombre websodio en internet");
             ws.setLink("http://miepisodios.com/websodio.avi");
             temporada.getEpisodios().add(ws);

             ws = new Websodio(38, "Nombre websodio2 en internet");
             ws.setLink("http://miepisodios.com/websodio2.avi");
             temporada.getEpisodios().add(ws);

         //Creo y asigno todos los episodios a la lista de la temporada
         //Termino la temporada y recien ahi agrego la temporada a la serie
         howIMetYM.getTemporadas().add(temporada);

         temporada = new Temporada();
         temporada.setNumero(3);

             episodio = new Episodio(1, "Wait for it");
             episodio.setDirector(new Director());
             episodio.getDirector().setNombre("Pamela Fryman");
             temporada.getEpisodios().add(episodio);

             episodio = new Episodio(4, "Little Boys");
             temporada.getEpisodios().add(episodio);

         howIMetYM.getTemporadas().add(temporada);

        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.setNombre("The Big Bang Theory");
        bbt.setAñoLanzamiento(2007);
        actor = new Actor();
        actor.setNombre("Kaley Cuoco");
        bbt.getActores().add(actor);

         temporada = new Temporada();
         temporada.setNumero(1);
             
             episodio = new Episodio(1, "Pilot");
             temporada.getEpisodios().add(episodio);

             episodio = new Episodio(2, "The Cooper-Hofstadter Polarization");
             temporada.getEpisodios().add(episodio);

         bbt.getTemporadas().add(temporada);
        
        this.series.add(bbt);

        Serie house = new Serie();
        house.setNombre("House of Cards");
         
         temporada = new Temporada();
         temporada.setNumero(1);
             episodio = new Episodio(1, "Chapter 1");
             episodio.setDirector(new Director());
             episodio.getDirector().setNombre("David Fincher");
             temporada.getEpisodios().add(episodio);

         house.getTemporadas().add(temporada);

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
            if ( serie.getNombre().equals(nombreABuscar))
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
            if (serie.getNombre().equals(nombreABuscar))
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
            if (pelicula.getNombre().equals(nombreABuscar2)) {
               return pelicula;
            }
        return null;
    }

    //return nombre de director de episodio y pelicula
    public String buscarDirector(String nombreDirector) {
        for (Pelicula pelicula : this.peliculas) { 
            if(pelicula.getDirector() != null && pelicula.getDirector().getNombre().equals(nombreDirector))
              return pelicula.getDirector().getNombre();
        }
        for (Serie serie: this.series) { 
            for (Temporada temporada : serie.getTemporadas()) 
                for (Episodio episodio : temporada.getEpisodios()) 
                    if (episodio.getDirector() != null && episodio.getDirector().getNombre().equals(nombreDirector)) {
                        return episodio.getDirector().getNombre();
                    }
        }
        return null;
    }

    //si existe el dirctor, imprimir pelicula/serie
    public void contenidoDelDirector(String directorBuscado) {
        
        for (Pelicula pelicula : this.peliculas) { 
            if(pelicula.getDirector() != null && pelicula.getDirector().getNombre().equals(directorBuscado)) 
                 System.out.println("Pelicula " + pelicula.getNombre());
        }
  
        for (Serie serie: this.series) { 
            for (Temporada temporada : serie.getTemporadas()) 
                for (Episodio episodio : temporada.getEpisodios()) 
                    if (episodio.getDirector() != null && episodio.getDirector().getNombre().equals(directorBuscado)) {  
                         System.out.println("Episodio " + episodio.getNombre() 
                         + ", de la serie " + serie.getNombre() + ", temporada " + temporada.getNumero());
                    }
        }
    }
}
