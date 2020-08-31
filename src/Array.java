import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Array {

/* Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2.
Размер массива задается пользователем. */

    private static int size;

    static int ent(){
        
            Scanner in = new Scanner(System.in);
            System.out.print("\nРазмер массива: ");
            size = in.nextInt();

        return size;
    }


    static String[] array(){

        String [] array = new String[ent()];

        for (int i=0; i < size; i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите элементы массива " + i + ": ");
            array[i] = in.nextLine();

        }

        return array;
    }


    static void output(){

        String [] array2 = array();

        for (int i=0; i < size; i++) {

            int z = Integer.parseInt(array2[i]);
            System.out.println(i + " элемент массива * 2 = " + z * 2);

        }

    }

}
