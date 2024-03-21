package Tema10;

import java.util.ArrayList;

public class Practica01 {

    public static void desplazar(ArrayList<Integer> l){
        l.add(0, 1.remove(1.size()-1));
    }
    public static void main(String[] args) {
        ArrayList<Integer> orden = new ArrayList<>();
        orden.add(13);
        orden.add(22);
        orden.add(4);
        orden.add(56);
        orden.add(12);
        System.out.println("Lista de numeros original");
        System.out.println(orden);

    }
}
