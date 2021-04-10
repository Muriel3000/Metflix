import java.util.List;
import java.util.ArrayList;

public class Temporada {

    private int numero;
    private String nombre;
    private List<Episodio> episodios = new ArrayList<>();

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Episodio> getEpisodios() {
        return this.episodios;
    }
    public void setEpisodios(List<Episodio> epiodios) {
        this.episodios = episodios;
    }

    public Episodio buscarEpisodio(int numeroEpisodio) {
        for (Episodio episodio : this.episodios) {
            if (episodio.getNumero() == numeroEpisodio) {
                return episodio;
            }
        }
        return null; //Vacio, nulo
    }

    public void buscarDirectorEpisodio(String nombreDirector) {
        for (Episodio episodio : this.episodios) {
            if (episodio.getDirector().getNombre().equals(nombreDirector)) {
                System.out.println("Episodio: " + episodio.getNombre());
            }
        }
    }
}
