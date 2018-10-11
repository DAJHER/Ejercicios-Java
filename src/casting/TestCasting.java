package casting;
class  Animal{
    void hacerRuido(){
        System.out.println("Ruido generico Animal");
    }
}
class  Perro extends Animal{
    @Override
    void hacerRuido(){System.out.println("Guau!!");}
    void levantarPata(){
        System.out.println("Perro levantando la pata");
    }
}
public class TestCasting {
    public static void main(String[] args){
        Animal[] animales = {new Animal(), new Perro(), new Animal()};
        for (Animal animal : animales){
            animal.hacerRuido();
            if (animal instanceof Perro){
                Perro p = (Perro) animal;
                p.levantarPata();
            }
        }
    }
}