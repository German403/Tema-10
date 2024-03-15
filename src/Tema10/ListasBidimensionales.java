package Tema10;

import java.util.ArrayList;

public class ListasBidimensionales {

    public static void main(String[] args) {
        //Me creo el array en 2 dimensiones
        ArrayList<ArrayList<Integer>> lista01 = new ArrayList<>();
        System.out.println("Lista 2D: "+lista01);

        int numberOfLists = 3;
        for (int i = 0; i < numberOfLists; i++) {
            lista01.add (new ArrayList<>());
        }
        System.out.println("Lista 2D inicializada: "+lista01);

        //Añadir elementos a la lista. El primero a la primera lista
        lista01.get(0).add(5);
        lista01.get(1).add(2);
        lista01.get(2).add(4);
        lista01.get(2).add(8);
        lista01.get(2).add(0, 3);//El primer numero sera la posicion y por ese el 3 pasara a ser el primero
        System.out.println("Lista 2D con valores: "+lista01);

        //Para imprimir sin corchetes
        for (ArrayList<Integer> list: lista01){
            for (Integer i1: list){
                System.out.printf("%s ", i1);
            }
        }
    }
}
