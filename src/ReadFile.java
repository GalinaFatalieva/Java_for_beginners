import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;

public class ReadFile {

/* Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt  */

    static void read() {

        String s;

        try (
            BufferedReader br = new BufferedReader (new FileReader("C:\\Users\\user\\Desktop\\Java_for_beginners\\src\\fileR.txt"))) {
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.err.println("Ошибка ввода-вывода: " + exc);
        }

    }

}
