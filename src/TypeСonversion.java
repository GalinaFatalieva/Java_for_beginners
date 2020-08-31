import java.util.Scanner;

public class TypeСonversion {

/* Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экран */

    static String input(){


        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        String s = in.nextLine();

        return s;
    }

    static void conversion() {

        try {
        String s = input();
        int x = Integer.parseInt (s);
        double y = (double) x;

        System.out.println("s = " + s);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        } catch (NumberFormatException exc){
            System.err.println("Введите число без дробной части");
        }
    }

}
