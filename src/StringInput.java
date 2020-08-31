import java.util.Scanner;

public class StringInput {

/* Необходимо произвести ввод строки с клавиатуры и
записать в строковую переменную.
Результат вывести на экран. */

    static void input(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите текст: ");
        String str = in.nextLine();

        System.out.println("Ваш текст: " + str);
    }





}
