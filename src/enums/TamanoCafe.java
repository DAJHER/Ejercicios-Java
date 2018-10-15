package enums;

public enum TamanoCafe {
    ALTO(8),
    GRANDE(10),
    VENTI(16),
    MAMALON(25){
        public  String getTipoTapa(){
            return "B";
        }
    };
    private int onzas;
    TamanoCafe(int onzas){
        this.onzas = onzas;
    }
    public int getOnzas() {
        return onzas;
    }
    public String getTipoTapa(){
        return "A";
    }
}