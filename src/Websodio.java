public class Websodio extends Episodio {

    public Websodio(int numero, String nombre) {
        super(numero, nombre); //Llamo al constructor de la superclase
        this.setLink(link);//seteo el link
    }
    
    private String link;
    public String getLink() {
        return this.link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    @Override
    //redefinir
    public void reproducir() {
    //uso el mismo metodo de episodio 'reproducir'
        System.out.println("Reproducir websodio del link " + this.link);
    }
    
}
