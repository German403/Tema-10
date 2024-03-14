package Tema10;

import java.util.*;

public class Actividad01 {

    static Collection rellenar(Collection c){
        c.add("perro");
        c.add("gato");
        c.add("perro");
        c.add("canario");
        System.out.println(c.size());
        return c;
    }

    static Map rellenar(Map m){
        m.put("perro", "San bernardo");
        m.put("gato", "montes");
        m.put("perro", "presa canario");
        System.out.println(m.size());
        return m;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList: "+rellenar(new ArrayList()));//cola con elementos repetidos
        System.out.println("HashSet: "+rellenar(new HashSet()));//cola con elementos no repetidos
        System.out.println("HashMap: "+rellenar(new HashMap()));//pila con elementos no repetidos
    }//FIn main
    /*
     * CONCLUSIONES
     * HashSet. Contiene un cojunto de objetos, que le permite determinar mas facil y rapidamente si un objeto esta en el conjunto o no.
     * HashMap. se imprimen entre llaves con el signo igual (clave=valor).
     * Listas. Se pueden crear elementos duplicados.
     */
}