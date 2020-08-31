import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        try {
            SortingArray.sorting();
        } catch (NumberFormatException| InputMismatchException exc){
            System.err.println("Введите число без дробной части");
        } catch (NegativeArraySizeException ex){
        System.err.println("Введите число без - ");
    }

    }
}