import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {


        try {
        Array.output();
        } catch (InputMismatchException | NegativeArraySizeException exc ) {
            System.err.println("Не верный ввод значений. Вводите только положительные цифры без дробной части");
            System.exit(0);
        }

    }
}