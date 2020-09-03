import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers {

/* Сумма всех простых чисел не превышающих N */

    static public int input(){

        int n = 0;
        
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            n = in.nextInt();
        } catch(InputMismatchException exc){
            System.err.println("Не верный формат. Введите число");
            System.exit(0);
        }
        return n;
    }

    static public void prime(){

        int n = input();
        int res = 0;

        for (int i = 2; i <= n; i++){

            int a =0;

            for (int j = 1; j <= i; j++){

                if (i % j == 0) a++;

                if (a == 3) break;
            }

            if ( a == 2) res += i;

        }

        System.out.println("Сумма всех простых чисел не превышающих N " + res);

    }

}
