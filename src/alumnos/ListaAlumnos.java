package alumnos;
import java.sql.SQLOutput;
import java.util.ArrayList;
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

    }
}
