import java.util.Scanner;

public class FinalTask {

/* Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат,
записать в переменную int и вывести на экран.
Необходимо использовать циклы,
нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую. */

    public static int r =1;

    static String enter() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String str = in.nextLine();
        return str;
    }

    static double[] array() {

        String str = enter();
        char s = '-';

        char[] chArray = str.toCharArray();

        if (chArray[0] == s){
            r = -1;
            chArray[0] = '0';
        }


        double[] dArray = new double[chArray.length];

        try {
            for (int i =0; i < chArray.length; i++) {

                dArray[i] = Double.parseDouble(Character.toString(chArray[i]));

                if (dArray[i] != 0 && dArray[i] != 1) {
                    System.err.println("Веденно число не в бинарном формате");
                    System.exit(0);
                }
            }
        } catch (NumberFormatException exc) {
                System.err.println("Не верный формат");
                System.exit(0);
        }

        return dArray;
    }


    static void changes(){

        double res = 0;
        int j = 0;
        double[] dArray = array();

        for (int i = dArray.length-1; i>=0; i--){

            res += dArray[i] * Math.pow(2, j++);
        }
        int result = (int) res*r;

        System.out.println("Число в десятичном формате: " + result);
    }

}
