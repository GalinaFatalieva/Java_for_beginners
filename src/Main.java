import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        try {
            TypeСonversion.conversion();
        } catch (NumberFormatException exc){
            System.err.println("Введите число без дробной части");
        }

    }
}