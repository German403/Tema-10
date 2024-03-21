package alumnos;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class ListaAlumnos {

    public static void main(String[] args) {
        ArrayList<Alumnos> alumnoDAM = new ArrayList<Alumnos>();
        Alumnos alumno1 = new Alumnos("Juan", "Torres", 1);
        alumnoDAM.add(alumno1);

        Alumnos alumno2 = new Alumnos("Sara", "Gonzalez", 2);
        alumnoDAM.add(alumno2);

        Alumnos alumno3 = new Alumnos("Elena", "Estenban", 3);
        alumnoDAM.add(alumno3);

        Alumnos alumno4 = new Alumnos("Pepe", "Blanco", 4);
        alumnoDAM.add(alumno4);


        Alumnos alumno5 = new Alumnos("Miguel", "Perez", 5);
        alumnoDAM.add(alumno5);

        //Imprimir elementos, uso un ITERATOR
        System.out.println("Alumnos de 1º de DAM: "+alumnoDAM.size());

        Iterator<Alumnos> itAlumnos = alumnoDAM.iterator();
        System.out.println("numreo           "+"nombre          "+"apellido            ");
        System.out.println("-------------------------------------------------------------");
        while (itAlumnos.hasNext()) {//Comprueban si quedan elementos en el iterador
            Alumnos alumnosTemp = itAlumnos.next();//Se declara el objeto para ir asignando valores
            System.out.println(" "+alumnosTemp.getNumero()+"          "+alumnosTemp.getNombre()+"             "+alumnosTemp.getApellido());

        }//fin while


        //Ordenacion de objetos
        Collections.sort(alumnoDAM, new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos a1, Alumnos a2) {
                return a1.getNombre().compareTo(a2.getNombre());
            }//Fin compare
        });//Fin iterator

        //Lista ordenada por nombres
        //Imprimir elementos, uso un ITERATOR
        System.out.println("Alumnos de 1º de DAM: "+alumnoDAM.size());
        itAlumnos = alumnoDAM.iterator();
        System.out.println("numreo           "+"nombre          "+"apellido            ");
        System.out.println("-------------------------------------------------------------");
        while (itAlumnos.hasNext()) {//Comprueban si quedan elementos en el iterador
            Alumnos alumnosTemp = itAlumnos.next();//Se declara el objeto para ir asignando valores
            System.out.println(" "+alumnosTemp.getNumero()+"          "+alumnosTemp.getNombre()+"             "+alumnosTemp.getApellido());
        }//fin while


        Collections.sort(alumnoDAM, new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos a1, Alumnos a2) {
                return a1.getApellido().compareTo(a2.getApellido());
            }//Fin compare
        });//Fin iterator

        for (Alumnos alumnoTemp:alumnoDAM){
            System.out.print(alumnoTemp.getApellido()+",");
            System.out.println(alumnoTemp.getNombre()+".");
        }

        //Lista ordenada por apellidos
        //Imprimir elementos, uso un ITERATOR
        System.out.println("Alumnos de 1º de DAM: "+alumnoDAM.size());
        itAlumnos = alumnoDAM.iterator();
        System.out.println("numreo           "+"nombre          "+"apellido            ");
        System.out.println("-------------------------------------------------------------");
        while (itAlumnos.hasNext()) {//Comprueban si quedan elementos en el iterador
            Alumnos alumnosTemp = itAlumnos.next();//Se declara el objeto para ir asignando valores
            System.out.println(" "+alumnosTemp.getNumero()+"          "+alumnosTemp.getNombre()+"             "+alumnosTemp.getApellido());
        }//fin while

    }
}
