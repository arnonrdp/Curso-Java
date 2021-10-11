package devdojo.maratonajava.javacore.v.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("DevDojo é o melhor curso do Brasil");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
