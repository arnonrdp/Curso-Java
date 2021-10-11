package devdojo.maratonajava.javacore.v.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);

            System.out.println("path: " + file.getPath());
            System.out.println("path absolute: " + file.getAbsolutePath());
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
            System.out.println("Is hidden? " + file.isHidden());
            System.out.println("Las modified: " + Instant.ofEpochMilli( file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
