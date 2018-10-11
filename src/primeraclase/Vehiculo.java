package primeraclase;

public abstract class Vehiculo {
    public Vehiculo(){

    }
    private int numeroLlantas;

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public abstract void lavarVehiculo();
}
