package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;

public class Auto extends Vehiculo{
    private String placa;
    //Constructor sin parametros (Default)
    public Auto() {
        placa = "Desconocido";
        setNumeroLlantas(4);
    }
    //Constructor que recibe un numero de placa
    public Auto(String placa) throws PlacaInvalidaException {
        placa = placa.trim();
        if (placa.length() >= 7 && placa.length()<=8){
            this.placa = placa;
        }else{
            throw new PlacaInvalidaException("Placa invalida");
            //this.placa = "Desconocido";
        }
        setNumeroLlantas(4);
    }
    public void lavarVehiculo() {
        System.out.println("Entrando al car wash");
    }
    public String getPlaca() {
            return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
}