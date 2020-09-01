import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        try {
            FinalTask3.exchange();
        } catch (InputMismatchException exc) {
            System.err.println("Не верный ввод значений. Вводите только цифры. Используйте запятую, как разделитель между целой и дробной частью.");
            System.exit(0);
        }

    }
}