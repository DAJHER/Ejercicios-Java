import ejemplostatic.Galleta;
import equals.Persona;
import loops.Loops;
import primeraclase.Auto;
import primeraclase.Motocicleta;
import primeraclase.Vehiculo;
import primeraclase.excepciones.PlacaInvalidaException;

public class HolaMundo {
    public static void main(String[] args) throws Exception {
        /*
        System.out.println("Hola mundo cruel.!!");

        //Loops loops = new Loops();
        //loops.iterarConFor();

        Auto auto = new Auto();
        System.out.println(auto.getPlaca());

		//Bloque try
        try {
            Auto auto2 = new Auto("  ULF-0877");
            System.out.println(auto2.getPlaca());
        } catch (PlacaInvalidaException e) {
            System.out.println("Ocurrio un problema al crear auto");
            throw e;
        }finally {
            //
        }
        //Vehiculo vehiculo = new Vehiculo();
        auto.lavarVehiculo();
        System.out.println( auto.getNumeroLlantas());

		//Bloque Motocicleta
        Motocicleta motocicleta  = new Motocicleta("UF-03");
        motocicleta.lavarVehiculo();
        System.out.println(motocicleta.getPlaca());
        System.out.println( motocicleta.getNumeroLlantas());
        */

        String s1 = "Hola mundo";
        String s2 = "Hola mundo";
        System.out.println(s1.equals(s2));

        Galleta galleta = new Galleta("","","","");


    }
}

