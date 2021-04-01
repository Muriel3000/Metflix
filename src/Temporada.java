import java.util.List;
import java.util.ArrayList;

public class Temporada {

    public int numero;
    public String nombre;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio buscarEpisodio(int numeroEpisodio) {
        for (Episodio episodio : this.episodios) {
            if (episodio.numero == numeroEpisodio) {
                return episodio;
            }
        }
        return null; // Vacio, nulo
    }
}