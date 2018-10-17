package operadorternario;

public class TestTernario {
    public static void main(String[] args){
        validarAcceso(25,17,18,16,14,12,22,-21);
    }
    private static void validarAcceso(int... edades){
        for (int edad: edades) {
            String acceso = (edad < 18) ? "Acceso denegado" : "Acceso aprobado";
            System.out.println(acceso);

            /*
            if (edad < 18)
                System.out.println("Acceso denegado");
            else
                System.out.println("Acceso aprobado");
            */
        }
    }
}
