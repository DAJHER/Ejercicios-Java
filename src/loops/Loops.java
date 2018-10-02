package loops;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Loops {
    public void iterarConFor(){
        //Iteraccion con ciclo FOR normal
        for (int i = 0; i<10; ++i)
        {
            System.out.println("Dentro del ciclo FOR " + i);
        }
        //Iteraccion con ciclo FOR EACH
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        for (Integer numero: numeros) {
            System.out.println("Dentro del ciclo FOR EACH " + numero);
        }
        //Iteracion con ciclo WHILE
        int x=0;
        while (x<5){
            System.out.println("Dentro del ciclo WHILE " + ++x);
            //++x;
        }
        //Iteracion con ciclo DO WHILE
        do{
            System.out.println("Dentro del ciclo DO WHILE " + x++);
            //x--;
        }while (x==0);
    }
}
