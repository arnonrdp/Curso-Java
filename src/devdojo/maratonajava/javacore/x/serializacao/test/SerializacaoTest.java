package devdojo.maratonajava.javacore.x.serializacao.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import devdojo.maratonajava.javacore.x.serializacao.domain.Aluno;

public class SerializacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Kuririn", "123456");

        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
