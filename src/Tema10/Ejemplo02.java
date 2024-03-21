package Tema10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejemplo02 {
    public static void main(String[] args) {
        Comparator<LocalDate> comparator = Collections.reverseOrder();

        ArrayList<LocalDate> examenesDAM = new ArrayList<LocalDate>();
        LocalDate programacion = LocalDate.parse("2024-05-20");
        examenesDAM.add(programacion);
        examenesDAM.add(LocalDate.parse("2024-05-21"));
        examenesDAM.add(LocalDate.parse("2024-05-19"));
        System.out.println("Examenes DAM");
        System.out.println(examenesDAM);
        System.out.println("Examenes DAM ordenados");
        Collections.sort(examenesDAM);
        System.out.println(examenesDAM);
        System.out.println("Examenes DAM ordenados de forma inversa");
        Collections.sort(examenesDAM, comparator);
        System.out.println(examenesDAM);

        //Copiar un Array
        ArrayList<LocalDate> examenesDAW = new ArrayList<LocalDate>(examenesDAM);

        examenesDAW.add(LocalDate.parse("2024-05-18"));
        System.out.println("Examenes DAW");
        System.out.println(examenesDAW);
        System.out.println("Examenes de DAW ordednados");
        Collections.sort(examenesDAW);
        System.out.println(examenesDAW);
        System.out.println("Examenes de DAW ordednados de forma inversa");
        Collections.sort(examenesDAW, comparator);
        System.out.println(examenesDAW);

    }
}
