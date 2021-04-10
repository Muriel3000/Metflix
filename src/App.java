//Metflix


import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner (System.in);
    
    public static void main(String[] args) throws Exception {

      // A partir de Metflix, buscar un episodio y reproducirlo
      Metflix miMetflix = new Metflix();
      System.out.println("Inicializando catalogo de Metflix");
      miMetflix.inicializarCatalogo();//Llamo al metodo que crea pelis y series
        
      System.out.println("Ingrese si desea buscar por Serie, Pelicula o Director: ");
      String buscador = Teclado.nextLine();
      String buscadorDir = "";
        
      if (buscador.equals("Director")) { 
          System.out.println("Ingrese nombre del director: ");
          String nombreDirector = Teclado.nextLine();
          //David Fincher(tiene episodio y peicula)
          
          //buscar director
          String directorBuscado = miMetflix.buscarDirector(nombreDirector);
          //if encontrado imprimir // si no 'no se encontro'
          if ( directorBuscado == null) {
            System.out.println("No se encontró el director.");
          }
          else {
            System.out.println("Del director " + nombreDirector);
            miMetflix.contenidoDelDirector(directorBuscado);
            System.out.println("Ingrese el contenido (Pelicula o Serie): ");
            buscadorDir = Teclado.nextLine();
          }
      }

      if (buscador.equals("Serie") || buscadorDir.equals("Serie")) { 
          System.out.println("Ingrese el nombre de la serie: ");
          String nombreABuscar = Teclado.nextLine();
          //Guardar la informacion
          Serie serieBuscada = miMetflix.buscarSerie(nombreABuscar);
          if (serieBuscada == null) {
            System.out.println("No se encontró la serie.");
            return;
          }
        
          //Ingresar por teclado
          System.out.println("Ingrese numero de temporada: ");
          int nroTemporada = Teclado.nextInt();
          Teclado.nextLine();
          Temporada temporada = serieBuscada.buscarTemporada(nroTemporada);

          System.out.println("Ingrese numero de episodio: ");
          int nroEpisodio = Teclado.nextInt();
          Teclado.nextLine();
          Episodio episodio =temporada.buscarEpisodio(nroEpisodio);
          episodio.reproducir();

          //Imprimir si lo que se reprodujo es un websodio o un episodio
          if (episodio instanceof Websodio) {
          System.out.println("El episodio es un websodio");
          }
          else {
          System.out.println("Es un episodio");
          } 

          //Si es un websodio quiero imprimir su link
          if (episodio instanceof Websodio) {
          Websodio websodio = (Websodio) episodio;
          //Casteo
           System.out.println("El link del websodio es: " + websodio.getLink());
          }
      }

      if (buscador.equals("Pelicula") || buscadorDir.equals("Pelicula")) { 
          System.out.println("Ingrese nombre de la pelicula: ");
          String nombreABuscar2 = Teclado.nextLine();
          Pelicula peliculaBuscada = miMetflix.buscarPelicula(nombreABuscar2);
          if (peliculaBuscada == null) { 
            System.out.println("La película no existe");
            return;
          }
          peliculaBuscada.reproducir();
      }
  } 
}




