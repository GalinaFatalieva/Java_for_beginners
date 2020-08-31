import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecordFile {

/* Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать. */

    static void record(){

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Остановить запись 'stop' ");

        try (FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\Java_for_beginners\\src\\fileW.txt")) {
        do {
            System.out.print("пишите: ");
            str = br.readLine();

            if (str.compareTo("stop") == 0) break;

            str = str + "\r\n";
            fw.write(str);
        } while (str.compareTo("stop") != 0);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
