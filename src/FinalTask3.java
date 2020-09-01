import java.util.Scanner;

public class FinalTask3 {

/* Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов) */



    static double PuttingCourse(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nКурс доллара = ");
        double course = in.nextDouble();

        if (course <= 0 ) {
            System.err.println("Курс доллара не может быть отрицательным или равняться 0");
            System.exit(0);
        }

        return course;
    }


    static double AmountOfMoney(){

        Scanner in = new Scanner(System.in);
        System.out.print("\nКоличество рублей: ");
        double amount = in.nextDouble();

        if (amount < 0 ) {
            System.err.println("Количество рублей не может быть отрицательным");
            System.exit(0);
        }

        return amount;
    }


    static void exchange(){

        double cour = PuttingCourse();
        double am = AmountOfMoney();

        double exch = am / cour;

        System.out.printf("\nИтого: %.2f", exch);
    }
}
