public class Episodio {

    private int numero;
    private String nombre;
    private int duracion; //en minutos
    private Director director;
    private String sinopsis;

    //CONSTRUCTOR
    public Episodio(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public Episodio(int numero, String nombre, int duracion) {
        this(numero, nombre);//Llama al constructor de dos parametros
        this.duracion = duracion;
    }

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

    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return this.director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + nombre);
    }
}
