import java.text.DateFormat;
import java.util.Date;

public class DiferenteFormatoFecha {

    public static void main(String[] args) {

        /* toda la fecha completa
        Date d1 = new Date();
        Calendar c1 = Calendar.getInstance();

        c1.setTime(d1);
        System.out.println("Hoy es: " + d1.toString());

        c1.roll(Calendar.MONTH, 1);
        System.out.println("la fecha después de un mes será: " + c1.getTime().toString());

        c1.roll(Calendar.HOUR, 7);
        System.out.println("la fecha después de 3 años será: " + c1.getTime().toString());
        */


        /*
        Date d1 = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(d1);

        System.out.println("Hoy es la " + cl.WEEK_OF_YEAR + " semana del año");
        System.out.println("Hoy es el " + cl.DAY_OF_MONTH + " dia del mes");
        System.out.println("Hoy es la " + cl.WEEK_OF_MONTH + " semana del mes");
        */


        // fecha
        Date dt = new Date(1000000000000L);
        DateFormat dformat[] = new DateFormat[6];
        dformat[0] = DateFormat.getInstance();
        dformat[1] = DateFormat.getDateInstance();
        dformat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dformat[3] = DateFormat.getDateInstance(DateFormat.FULL);
        dformat[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dformat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

        for (DateFormat dateform : dformat)
            System.out.println(dateform.format(dt));

    }
}
