/*
Muestra el día de la semana utilizando un array
 */
package arraysh1;

import java.util.Calendar;

/**
 *
 * @author A8-PC59
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1)
                + "-"
                + now.get(Calendar.DATE)
                + "-"
                + now.get(Calendar.YEAR));

        String[] strDays = new String[]{
            "Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado"};
        System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}

