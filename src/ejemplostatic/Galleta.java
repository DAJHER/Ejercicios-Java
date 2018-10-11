package ejemplostatic;

public class Galleta {
    private String sabor;
    private String tamaño;
    private String forma;
    private String color;
    private static int cantidad=0;

    public Galleta(String sabor, String tamaño, String forma, String color){
        this.cantidad++;
        this.setSabor( cantidad + " - " +sabor);
        this.setTamaño(tamaño);
        this.setForma(forma);
        this.setColor(color);

    }

    public static int getCantidad() {
        return cantidad;
    }
    public static void setCantidad(int cantidad) {
        Galleta.cantidad = cantidad;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
