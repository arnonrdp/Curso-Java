package devdojo.maratonajava.javacore.m.interfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
