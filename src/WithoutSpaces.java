import java.util.Scanner;

public class WithoutSpaces {

/* Для введенной с клавиатуры строки
необходимо провести отсев пробелов.
Результат в виде строки без пробелов вывести на экран. */

    static String input(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите текст: ");
        String str = in.nextLine();

        return str;
    }

    static void remove(){


        String str2 = input();
        String strResult = "";

        String[] isbnParts = str2.split(" ");

        for (int i = 0; i < isbnParts.length; i++){

            strResult = strResult.concat(isbnParts[i]);
        }

        System.out.println(strResult);
    }
}
