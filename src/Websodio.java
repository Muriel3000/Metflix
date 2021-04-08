public class Websodio extends Episodio {

    public String link;

    @Override
    //redefinir
    public void reproducir() {
    //uso el mismo metodo de episodio 'reproducir'
        System.out.println("Reproducir websodio del link " + this.link);
    }
    
}
