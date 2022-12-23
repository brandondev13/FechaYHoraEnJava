import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fecha {

    public static void main(String[] args) {


        /* Dias entre semana
        String entreSemanas[] = new DateFormatSymbols().getWeekdays();
        for (int i = 2; i < (entreSemanas.length-1); i++) {
            String entreSemana = entreSemanas[i];
            System.out.println("Entre semana: " + entreSemana);
        }
        */


        /* Adelantar todos
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);
        System.out.println("Hoy es: " + d1.toString());

        cl.add(Calendar.MONTH, 1);
        System.out.println("la fecha después de un mes será: " + cl.getTime().toString());

        cl.add(Calendar.HOUR, 70);
        System.out.println("la fecha después de 70 horas será: " + cl.getTime().toString());

        cl.add(Calendar.YEAR, 3);
        System.out.println("la fecha después de 3 años será: " + cl.getTime().toString());
         */


        /* Muestra la fecha en un idioma diferente y en formato diferente
        Date d1 = new Date();
        System.out.println("Hoy es: " + d1.toString());
        Locale ubicacion = new Locale("it", "ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, ubicacion);
        System.out.println("hoy es en idioma italiano en formato suiza: " + df.format(d1));
        */


        /* Muestra la fecha en un idioma diferente
        Date d1 = new Date();
        System.out.println("Hoy es: " + d1.toString());
        Locale ubicacion = new Locale("it");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, ubicacion);
        System.out.println("hoy es: " + df.format(d1));
        */


    }
}
