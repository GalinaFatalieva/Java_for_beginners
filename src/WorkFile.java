import java.io.*;

public class WorkFile {

/* Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте. */

    static void read() {

        String s;
        int i = 0;

        try (
                BufferedReader br1 = new BufferedReader (new FileReader("src\\fileWork.txt"))) {
            while ((s = br1.readLine()) != null){
                System.out.println(s);
                i++;
            }
        } catch (IOException exc) {
            System.err.println("Ошибка ввода-вывода: " + exc);
        }


        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("src\\fileWork.txt")) {

            int j = 0;
            do {
                System.out.print("пишите: ");
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
                j++;
            } while (j < i);

        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
