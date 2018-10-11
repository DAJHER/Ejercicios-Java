package ejemplostatic;

import java.util.ArrayList;
import java.util.List;

public class GalletasTest {
    public static void main(String[] args){
        List<Galleta> Galletas = CrearGalletas();
        for (Galleta galleta: Galletas) {
            System.out.println(galleta.getSabor() + " - " + galleta.getForma() +  " - " + galleta.getColor() + " - " + galleta.getTamaño());
        }
    }
    private static List<Galleta> CrearGalletas(){
        List<Galleta> Galletas = new ArrayList<>();
        Galletas.add(new Galleta("Chocolate","Chica","Redonda","Cafe"));
        Galletas.add(new Galleta("Oreo","Mediana","Ovalada","Negra"));
        Galletas.add(new Galleta("Gansito","Grande","Rectangular","Cafe"));
        Galletas.add(new Galleta("Platano","Chica","Ovalada","Amarillo"));
        Galletas.add(new Galleta("ChocoChispas","Grande","Redonda","Cafe"));
        Galletas.add(new Galleta("Vainilla","Mediana","Redonda","Beige"));
        Galletas.add(new Galleta("Frutos rojos","Grande","Redonda","Crema"));
        Galletas.add(new Galleta("Chemnise","mediana","Triangular","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        //Galletas.add(new Galleta("Chocolare","Chica","Redonda","Cafe"));
        return Galletas;// Galleta("","","","");
    }
}
