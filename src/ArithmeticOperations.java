import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticOperations {
    private static double x;
    private static double y;
    private static double z;

/*  1. Ввод трех чисел с клавиатуры x, y, z
    2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
    3. Деление среднего арифметического на 2 без остатка
    4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"*/

    static double[] enter() {

        try {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите x: ");
        x = in.nextDouble();
        System.out.print("Введите y: ");
        y = in.nextDouble();
        System.out.print("Введите z: ");
        z = in.nextDouble();

        } catch (InputMismatchException exc) {
            System.err.println("Не верный ввод значений. Вводите только цифры. Используйте запятую, как разделитель между целой и дробной частью.");
            System.exit(0);
        }


        return new double[] {x, y, z};
    }

    static double average (){

        double[] array = enter();
        double sum = 0;

        for (double element: array){

            sum += element;
        }

        double answer = sum / array.length;
        System.out.println("Среднее арифметическое чисел " + array[0] + ", " + array[1] + ", " + array[2] + " = " + answer);

        return answer;
    }

    static int division(){

        int average = (int) average ();

        int equally = average/2;

        return equally;
    }

    static void output(){

        int i = division();

        if (i>3) System.out.println("Программа выполнена корректно");
        else System.out.println("Программа не корректна");;

    }
}
