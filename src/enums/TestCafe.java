package enums;
public class TestCafe {
    public static void main(String[] args){
        Cafe cafeMoca = new Cafe();
        Cafe cafeCapuchino = new Cafe();
        Cafe cafeFrapuchino = new Cafe();


        cafeMoca.setTamano(TamanoCafe.GRANDE);
        cafeFrapuchino.setTamano(TamanoCafe.VENTI);
        cafeCapuchino.setTamano(TamanoCafe.MAMALON);

        System.out.println(cafeMoca.getTamano() + " " + cafeMoca.getTamano().getOnzas() + " Onzas Tapa: " + cafeMoca.getTamano().getTipoTapa());
        System.out.println(cafeCapuchino.getTamano() + " " + cafeCapuchino.getTamano().getOnzas() + " Onzas Tapa: " + cafeCapuchino.getTamano().getTipoTapa() );
        System.out.println(cafeFrapuchino.getTamano() + " " + cafeFrapuchino.getTamano().getOnzas() + " Onzas Tapa: " + cafeFrapuchino.getTamano().getTipoTapa());
    }
}
