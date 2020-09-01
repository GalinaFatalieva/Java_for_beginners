import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        try {
        FinalTask2.vstavkami();
        } catch (InputMismatchException exc) {
            System.err.println("Не верный ввод значений. Вводите только цифры.");
            System.exit(0);
        }

    }
}