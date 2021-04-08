public class Pelicula extends Contenido {
   
    public int duracion;//en minutos
    public Director director = new Director();
    public boolean filmadaEnIMAX;

    public void reproducir() {
        System.out.println("Reproduciendo " + nombre);
    }
}
