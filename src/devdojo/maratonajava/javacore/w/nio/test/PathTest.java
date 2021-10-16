package devdojo.maratonajava.javacore.w.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/arnon/Sites/Curso Java/DevDojo/file.txt");
        Path p2 = Paths.get("/Users/arnon", "/Curso Java/DevDojo/file.txt");
        Path p3 = Paths.get("/Users/arnon", "/Sites/Curso Java/DevDojo","/file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
    }
}
