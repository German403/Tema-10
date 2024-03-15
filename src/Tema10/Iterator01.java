package Tema10;
import java.util.*;

public class Iterator01 {

    public static void main(String[] args) {
        //Iterador en una lista
        //Se aplica polimorfismo
        Iterable<String> lista01DAM1 = List.of("Alijandro", "David", "Lucia", "Maria");
        lista01DAM1.forEach(System.out::println);

        //Crear el objeto a partir de la clase concreta (Arraylist)
        //A la izquierda el tipo de lista Arraylist
        ArrayList<Integer> lista02 = new ArrayList<>();

        System.out.println("Tipo de lista1: "+lista01DAM1.getClass());
        System.out.println("Tipo de lista2: "+lista02.getClass());

        //Definir el tamaño incial de la lista

        ArrayList<String> lista03 = new ArrayList<>(2);
        lista03.add("Sara");
        lista03.add("Juan");
        System.out.print(lista03+",");
        System.out.println();
        lista03.add("Elena");
        System.out.println(lista03+",");
        System.out.println();

        lista03.set(0, "Sara Gonzalez");
        lista03.set(1, "Juan Torres");
        lista03.set(2, "Elena Sanchez");
        lista03.add("David");
        lista03.set(3, "David Bisbal o Bustamante");
        System.out.println("Lista 3 modificada:"+lista03+",");
        System.out.println();
        System.out.println("Elemento 2 de la lista:"+lista03.get(1));
        System.out.println(lista03.size());

        //Eliminar un elemento de la lista
        lista03.remove(1);
        System.out.println("Lista con un elemento:"+lista03+",");
        System.out.println(lista03.size());

        lista03.remove("David Bisbal o Bustamante");
        System.out.println("Lista con un elemento:"+lista03+",");
        System.out.println(lista03.size());

        //Eliminar todos los elementos de la lista
        //lista03.removeAll(lista03);
        System.out.println("Lista:"+lista03);
        System.out.println(lista03.size());

        //metodo contains
        boolean contiene = false;
        contiene = lista03.contains("Sara Gonzalez");
        System.out.println("Valor del boolean contiene: "+contiene);

        //ordenar colecciones
        Collections.sort(lista03);
        System.out.println("Lista 3 ordenada: "+lista03);

        ArrayList<Integer> lista04 = new ArrayList<Integer>();
        lista04.add(5);
        lista04.add(7);
        lista04.add(3);
        Collections.sort(lista04, Integer::compareTo);
        System.out.println("Lista 4 ordenada: "+lista04);

        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(lista04, comparador);
        System.out.println("Lista 4 ordenada de forma inversa: "+lista04);

        ArrayList<Integer> lista04b = new ArrayList<>(List.of(5, 7, 3, -1, -5));
        lista04b.sort(Integer::compareTo);
        System.out.println("Lista 4 ordenada: "+lista04b);
        lista04b.sort(comparador);
        System.out.println("Lista 4 ordenada de forma inversa: "+lista04b);

        //copiar valores en una lista
        List<String> lista05 = Collections.nCopies(5, "Hola");
        System.out.println("Lista repetida: "+lista05);

    }
    }
