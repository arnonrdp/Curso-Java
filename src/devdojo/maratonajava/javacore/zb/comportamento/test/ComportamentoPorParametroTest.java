package devdojo.maratonajava.javacore.zb.comportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import devdojo.maratonajava.javacore.zb.comportamento.domain.Car;

public class ComportamentoPorParametroTest {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("red", 1998), new Car("blue", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 2010);
        System.out.println("-----------------------------------------");
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println("-----------------------------------------");
        System.out.println(yearBefore);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
