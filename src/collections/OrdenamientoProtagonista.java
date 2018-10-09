package collections;

import java.util.Comparator;

public class OrdenamientoProtagonista implements Comparator<Dvd>{
    @Override
    public int compare(Dvd uno, Dvd dos){
        return uno.getProtagonista().compareTo(dos.getProtagonista());
    }
}
