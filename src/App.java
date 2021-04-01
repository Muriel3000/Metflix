//Metflix

//POR QUE DA ERROR INICIALIZAR CATALOGO ????

import java.util.Scanner;

public class App {

    public Scanner Teclado = new Scanner (System.in);

    public static void main(String[] args) throws Exception {

        // A partir de Metflix, buscar un episodio y reproducirlo
        Metflix miMetflix = new Metflix();
        
        System.out.println("Inicializando catalogo de Metflix");
        miMetflix.incializarCatalogo();//Llamo al metodo que crea pelis y series

        //Guardar la informacion
        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");
            if (serieBuscada == null) {
                   System.out.println("Serie no existe");
                   return;
            }

        /*
        Buscar en la serieBuscada la temporada y devolver temporada
        Especificar numero de temporada y episodio
        */
        Temporada temporada = serieBuscada.buscarTemporada(1);
        Episodio episodio = temporada.buscarEpisodio(1);
        /*
        Serie      serieBuscada = miMetflix.    buscarSerie       ("How I met your mother");
        Temporada  temporada    = serieBuscada. buscarTemporada   (5);
        Episodio   episodio     = temporada.    buscarEpisodio    (1);
        */
        episodio.reproducir();

        Pelicula peliculaBuscada = miMetflix.buscarPelicula("Harry Potter y la piedra filosofal");
              if (peliculaBuscada == null) { 
                  System.out.println("La película no existe");
                  return;
                }
        peliculaBuscada.reproducir();

    }

    /* 29/03
    public void reproducirSerie(String nombreSerie, int numeroTemporada, int numeroEpisodio) {
         
        Metflix miMetflix.inicializarCatalogo();

        nombreSerie = Teclado.nextLine();
        Serie serieBuscada = miMetflix.buscarSerie(nombreSerie);

        numeroTemporada = Teclado.nextInt();
        Temporada temporada = serieBuscada.bucarTemporada(numeroTemporada);

        numeroEpisodio = Teclado.nextInt();
        Episodio episodio = temporada.buscarEpisodio(numeroEpisodio);
    }
    */ 

}
