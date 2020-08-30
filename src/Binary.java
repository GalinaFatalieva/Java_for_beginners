import java.util.Scanner;

public class Binary {

    //Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

    static String enter(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in binary format: ");
        String str = in.nextLine();
        return str;
    }

    static void bin(){

        String str = enter();
        try {
           int bin = Integer.parseInt(str, 2);
            System.out.println("Your number Integer: " + bin);
        } catch (NumberFormatException exc) {
            System.err.println("Introduced non-binary format");
        }
    }

}
