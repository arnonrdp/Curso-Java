package devdojo.maratonajava.javacore.zc.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {
        private static <T> void forEach(List<T> list, Consumer<T> consumer) {
            for (T t : list) {
                consumer.accept(t);
            }
        }
    
        private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
            List<R> result = new ArrayList<>();
            for (T e : list) {
                R r = function.apply(e);
                result.add(r);
            }
            return result;
        }

    public static void main(String[] args) {
        List<String> strings = List.of("Kuririn", "Kame", "Gohan", "Piccolo");
        forEach(strings, System.out::println);

        List<Integer> integers = map(strings, String::length);
        List<String> map = map(strings, String::toUpperCase);
        System.out.println("-----------------------------");
        System.out.println(integers);
        System.out.println(map);
    }
}
