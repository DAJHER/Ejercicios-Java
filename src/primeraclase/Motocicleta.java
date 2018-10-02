package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;

public class Motocicleta extends Vehiculo {
    private String placa;

    public Motocicleta() {
        placa = "Desconocido";
        setNumeroLlantas(2);
    }
    public Motocicleta(String placa) throws PlacaInvalidaException {
        placa = placa.trim();
        if (placa.length() >= 4 && placa.length() <= 5) {
            this.placa = placa;
        } else {
            throw new PlacaInvalidaException("Placa invalida");
            //this.placa = "Desconocido";
        }
        setNumeroLlantas(2);
    }
    public void lavarVehiculo(){
        System.out.println("Lavando moto a mano");
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

}
