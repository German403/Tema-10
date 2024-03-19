package Tema10;

import java.util.ArrayList;
import java.util.Scanner;
        /*
        Otro ejercicio DAM1:
        Añadir alumno
        eliminar alumno
        mostrar todos los alumnos
        Usar ArrayList
         */

public class Clase_arraylist {
    public static ArrayList<String> clase = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        int opcion;
        do {
            System.out.println("Elige una de las siguientes opciones" +
                    "\nSeleccione 1 para añadir un alumno" +
                    "\nSeleccione 2 para eliminar un alumno" +
                    "\nSeleccione 3 para mostrar los alumnos" +
                    "\nSeleccione 4 para salir del programa");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Indique el nombre del alumno");
                    String alumno = scanner.nextLine();
                    introducirAlumno(alumno);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del alumno que quieres eliminar");
                    alumno = scanner.nextLine();
                    eliminarAlumno(alumno);
                    break;
                case 3:
                    clase.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 4);
    }

    public static void introducirAlumno(String alumno) {
        clase.add(alumno);
    }

    public static void eliminarAlumno(String alumno) {
        clase.remove(alumno);
    }

    public static void main(String[] args) {
        menu();
    }
}
