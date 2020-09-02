import java.util.Scanner;

public class FinalTaskV2 {


    static double[] enter() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в формате дополнительного кода (8 бит): ");
        String str = in.nextLine();

        char[] chArray = str.toCharArray();

        if (chArray.length != 8){
            System.err.println("Не верная длина чила, должна быть 8 символов");
            System.exit(0);
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
        double[] dArray = enter();
        int s = 1;
        
        if (dArray[0] == 1){
            s = -1;
            dArray[0] = 0;
        }

       for (int i = dArray.length-1; i>=0; i--){

            res += dArray[i] * Math.pow(2, j++);
        }
        int result = (int) res*s;

        System.out.println("Число в десятичном формате: " + result);
    }












}
