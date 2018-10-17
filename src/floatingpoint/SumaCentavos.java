package floatingpoint;

import java.math.BigDecimal;

public class SumaCentavos  {
    public static void main(String[] args){
        BigDecimal unCentavoBigDecimal = new BigDecimal("0.01");
        BigDecimal sumaBigDecimal = unCentavoBigDecimal.add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal).add(unCentavoBigDecimal);
        System.out.println( sumaBigDecimal);

        double unCentavo = 0.01;
        double suma = unCentavo + unCentavo + unCentavo + unCentavo + unCentavo + unCentavo;
        System.out.println( suma);
    }
}
