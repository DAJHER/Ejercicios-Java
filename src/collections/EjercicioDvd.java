package collections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioDvd {
    public static  void main(String[] args) {
        List<Dvd> peliculas = Dvd.LlenarLista();
        /*
        for (Dvd pelicula: peliculas) {
            System.out.println(pelicula);
        }
        Collections.sort(peliculas);
        for (Dvd dvd : peliculas){
            System.out.println(dvd);
        }
        Collections.sort(peliculas, new OrdenamientoPorGenero());
        for (Dvd dvd : peliculas){
            System.out.println(dvd);
        }
*/
        Collections.sort(peliculas, new OrdenamientoProtagonista());
        for (Dvd dvd : peliculas){
            System.out.println(dvd);
        }
        System.out.println("'''''''''''''");
        Collections.sort(peliculas, new OrdenamientoPorDirector());
        for (Dvd dvd : peliculas){
            System.out.println(dvd);
        }
/*
        //Dvd dvd = new Dvd("El alquimista");
        //Dvd dvd = new Dvd("El alquimista", "Novela");
        Dvd dvd = new Dvd("El alquimista", "Novela", "Paholo Coello");
        //System.out.println(dvd.LlenarLista());
        System.out.println("Titulo: " + dvd.getTitulo());
        System.out.println("Genero: " + dvd.getGenero());
        System.out.println("Protagonista: " +dvd.getProtagonista());
*/
    }
}
