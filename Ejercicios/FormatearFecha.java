import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatearFecha {
    
    public static void main(String[] args) {

        /* Mostrar solo la Hora
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("Hora en formato h : " + sdf.format(date));
        */


        /* Mostrar solo los segundos
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        System.out.println("Segundos en formato ss : " + sdf.format(date));
        */


        /* Mostrar solo los minutos
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("mm");
        System.out.println("Minutos en formato mm : " + sdf.format(date));
        */


        /* Mostrar solo el mes
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        System.out.println("Mes en formato MMMM : " + sdf.format(date));
        */
        

        /* Mostrar todos los meses
        String meses[] = new DateFormatSymbols().getShortMonths();
        for (int i = 0; i < (meses.length-1); i++) {
            String mes = meses[i];
            System.out.println("Mes: " + mes);
        }
        */


    }
}
