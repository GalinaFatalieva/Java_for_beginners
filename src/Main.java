import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {


        try {
            Matrix.output();
        } catch (InputMismatchException | NegativeArraySizeException | ExceptionInInitializerError exc ) {
            System.err.println("Не верный ввод значений. Вводите только положительные цифры без дробной части");
            System.exit(0);
        } catch (NumberFormatException ex ) {
            System.err.println("Не верный ввод значений. Вводите только цифры без дробной части");
        }

    }
}