import java.util.Scanner;

public class MultTable {

    // Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

    static int input(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        return num;
    }

    static void table(){

        int num = input();
        int i = 1;

        switch (i){
            case (1):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (2):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (3):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (4):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (5):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (6):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (7):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (8):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (9):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
            case (10):
                System.out.println( num + " * " + i + " = " + num*i);
                i = ++i;
                break;
        }

    }
}
