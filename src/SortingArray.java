import java.util.Scanner;

public class SortingArray {

/* Написать программу сортировки по возрастанию
заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки. */

    private static int size;

    static int enter(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nРазмер массива: ");
        size = in.nextInt();

        return size;
    }


    static int[] array(){

        int [] array = new int[enter()];

        for (int i=0; i < size; i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите элементы массива " + i + ": ");
            array[i] = in.nextInt();
        }

        return array;
    }

    static void sorting(){

        int [] arr = array();

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }
        }

        for (int i=0; i < arr.length; i++) {

            System.out.println(i+ " элемент сортированного массива " +arr[i]);

        }
    }



}
