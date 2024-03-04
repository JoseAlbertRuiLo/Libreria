package libreria;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un numero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static Date readDate(String prompt) {
        System.out.print(prompt);
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //Este es el formato para poner la fecha
        while (date == null) {
            try {
                date = sdf.parse(scanner.next());
            } catch (ParseException e) {
                System.out.print("Formato de fecha incorrecto, ingrese la fecha en formato y-M-d: ");
            }
        }
        return date;
    }
}


