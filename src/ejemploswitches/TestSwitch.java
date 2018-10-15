package ejemploswitches;
public class TestSwitch {
    public static void main(String[] args){
        int x= 5;
        switch(x){
            case 1:
                System.out.println("x es igual a 1");
                break;
            case 5:
                System.out.println("x es igual a 5");
                break;
            case 3:
                System.out.println("x es igual a 3");
                break;            default:
                System.out.println("No se sabe el valor de x");
        }

        Color color = Color.VERDE;
        switch (color){
            case AZUL:
                System.out.print("El color es Azul");
                break;
            case ROJO:
                System.out.print("El color es Rojo");
                break;
            case VERDE:
                System.out.print("El color es Verde");
                break;
            default:
                System.out.print("No se conoce el color");
                break;
        }
    }
}
