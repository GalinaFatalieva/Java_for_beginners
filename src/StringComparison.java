import java.util.Scanner;

public class StringComparison {

/* Необходимо провести сравнение длины двух строк,
которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной.
Если длины равны, вывести соответствующее сообщение. */


    static String[] input(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите текст 1: ");
        String str1 = in.nextLine();
        System.out.print("\nВведите текст 2: ");
        String str2 = in.nextLine();

        return new String[] {str1, str2};
    }

    static void comparison() {

        String[] str = input();
        String str1 = str[0];
        String str2 = str[1];
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1==len2) System.out.println("Введеный текст 1 и 2 равны");
        else if (len1 > len2) System.out.println(str1);
        else System.out.println(str2);
    }

}
