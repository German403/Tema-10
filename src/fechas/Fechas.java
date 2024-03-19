package fechas;

import java.util.Calendar;
import java.sql.Date;
import java.time.*;

public class Fechas {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("Hoy es: "+today.getTime());

        LocalDate fechaNacimiento = LocalDate.parse("2009-03-01");
        System.out.println("Formato Java.Time: "+fechaNacimiento);
    }
}
