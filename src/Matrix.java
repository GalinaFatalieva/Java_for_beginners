import java.util.Scanner;

public class Matrix {

/* Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем. */

    static int[] ent(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nРазмер матрицы по вертикале: ");
        int y = in.nextInt();
        System.out.print("Размер матрицы по горизонтале: ");
        int x = in.nextInt();


        return new int[]{y,x};
    }

    private static int[] array = ent();


    static String[][] matrix(){

        String [] [] matrix = new String[array[0]] [array[1]];

        for (int i=0; i < array[0]; i++) {
            for (int j=0; j < array[1]; j++) {

                Scanner in = new Scanner(System.in);
                System.out.print("Введите элементы массива " + i + " " + j + ": ");
                matrix[i][j] = in.nextLine();
            }
        }

        return matrix;
    }


    static void output(){

        String [][] matrix2 = matrix();

        for (int i=0; i < 1; i++) {
            for (int j=0; j < array[1]; j++) {

                int z = Integer.parseInt(matrix2[i][j]);
                System.out.println(i + " " + j + " элемент матрицы * 3 = " + z * 3);

            }
        }

    }


}
