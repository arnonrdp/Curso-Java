package devdojo.maratonajava.javacore.m.interfaces.test;

import devdojo.maratonajava.javacore.m.interfaces.domain.DatabaseLoader;
import devdojo.maratonajava.javacore.m.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
