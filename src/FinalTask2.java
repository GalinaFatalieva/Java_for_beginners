import java.util.Scanner;

public class FinalTask2 {

/* Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла. */


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


    static void vstavkami() {

        int [] arr = array();
        int tmp, j;

        for(int i =0 ; i < arr.length-1 ; i++){
            if( arr[i] > arr[i + 1] ) {
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                    while (j > 0 && tmp < arr[j-1]){
                        arr[j] = arr[j - 1];
                        j--;
                    }
                    arr[j] = tmp;

            }
        }

        for (int i=0; i < arr.length; i++) {

            System.out.println(i+ " элемент сортированного массива " +arr[i]);

        }
    }
}
