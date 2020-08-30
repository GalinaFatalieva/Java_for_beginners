import java.util.InputMismatchException;
import java.util.Scanner;

public class Сonstant {


/*Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z.
Программа должна сравнивать введенное значение с клавиатуры со значением констант
и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"*/

    private static int number;

    final int X = 0;
    final int Y = -10;
    final int Z = 10;

    static int enter(){

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("\nВведите число: ");
            number = in.nextInt();
        } catch (InputMismatchException exc) {
            System.err.println("Не верный ввод значений. Вводите только цифры без дробнй части");
            System.exit(0);
        }

        return number;
    }

    static void comparisons(){

        int i = enter();

        switch (i) {
            case 0:
            case 10:
            case -10:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }

    }

}
