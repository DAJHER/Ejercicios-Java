package collections;

import java.util.ArrayList;
import java.util.List;

public class Dvd implements Comparable<Dvd> {
    private String titulo;
    private String genero;
    private String protagonista;
    private String director;
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
    public Dvd(String titulo, String genero, String protagonista, String director){
        this (titulo,genero, protagonista);
        this.setDirector(director);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {return genero;}
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getProtagonista() {
        return protagonista;
    }
    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}

    public static List<Dvd> LlenarLista(){
        List<Dvd> lista = new ArrayList<>();
        Dvd tressMSC = new Dvd("3MSC","Drama", "Mario Casas", "Fernando González Molina");
        lista.add(tressMSC);
        Dvd piePequeño = new Dvd("Pie Pequeño","Comedia ", "Channing Tatum", "Karey Kirkpatrick");
        lista.add(piePequeño);
        Dvd aventMedieval = new Dvd("Una loca aventura medieval","Aventura", "Danny McBride", "David Gordon Green");
        lista.add(aventMedieval);
        Dvd milla22 = new Dvd("Milla 22","Accion y Aventura", "Lauren Cohan", "Peter Berg");
        lista.add(milla22);
        Dvd elViaje = new Dvd("El viaje de Nisha","Drama", "Maria Mozhdah", "Iram Haq");
        lista.add(elViaje);
        Dvd revenge = new Dvd("Revenge","Suspense / Thriller, Acción y Aventuras", "Kevin Janssens", "Coralie Fargeat");
        lista.add(revenge);
        Dvd vecinos = new Dvd("Buenos vecinos","Comedia, Drama", "Steinþór Hróar Steinþórsson", "Nicholas Stoller");
        lista.add(vecinos);
        Dvd marEnredos = new Dvd("Un mar de enredos","Comedia, Romántica", "Emily Maddison", "Rob Greenberg");
        lista.add(marEnredos);
        Dvd increíbles2 = new Dvd("Los increíbles 2","Acción y Aventuras, Animación", "Holly Hunter", "Brad Bird");
        lista.add(increíbles2);
        Dvd deadpool = new Dvd("Deadpool","Acción, Superhéroes, Ciencia ficción, Comedia", "Ryan Reynolds", "Tim Miller");
        lista.add(deadpool);

        return lista;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + " - Genero: " + genero + " - Protagonista: " + protagonista + " - Director: " + director ;
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public int compareTo(Dvd o) {
        return titulo.compareTo(o.titulo);
    }
}
