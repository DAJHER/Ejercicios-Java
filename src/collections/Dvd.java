package collections;

public class Dvd {
    private String titulo;
    private String genero;
    private String protagonista;
    public Dvd(){
    }
    public Dvd(String titulo){
        this.setTitulo(titulo);
            //this.titulo = titulo;
    }
    public Dvd(String titulo, String genero){
        this (titulo);
        //this.genero = genero;
        this.setGenero(genero);
    }
    public Dvd(String titulo, String genero, String protagonista){
        this (titulo,genero);
        //this.protagonista = protagonista;
        this.setProtagonista(protagonista);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getProtagonista() {
        return protagonista;
    }
    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
}
