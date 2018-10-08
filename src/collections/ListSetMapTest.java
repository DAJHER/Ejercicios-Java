package collections;

import java.util.*;
import java.util.Map.Entry;

public class ListSetMapTest {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Israel");
        lista.add("Dan");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");
        lista.add("Josman");
        lista.add("Gera");

        Set<String> set = new HashSet<>();
        set.add("Israel");
        set.add("Dann");
        set.add("Serch");
        set.add("Zoe");
        set.add("Lalo");
        set.add("Sandia");
        set.add("Josman");
        set.add("Gera");
        set.add("Josman");
        set.add("Gera");

        Map<String, String> mapa = new HashMap<>();
        mapa.put("Isra","Israel Segundo");
        mapa.put("Dann","Dann Hernandez");
        mapa.put("Serch","Sergio Rivera");
        mapa.put("Josman","Jose Manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");
        mapa.put("Josman","Jose Manuel Moreno");
        mapa.put("Gera","Gerardo Rincon Palo alto");

        System.out.println("Iterando Lista");
        for (String valor: lista) {
            System.out.println(valor);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Iterando set");
        for (String valor: set) {
            System.out.println(valor);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Iterando Mapa");
        for (String valor: mapa.values()) {
            System.out.println(valor);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        for (Entry<String, String> entry: mapa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(new ListSetMapTest().hashCode());
    }
}

