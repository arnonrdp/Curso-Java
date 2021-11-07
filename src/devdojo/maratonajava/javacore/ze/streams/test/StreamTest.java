package devdojo.maratonajava.javacore.ze.streams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import devdojo.maratonajava.javacore.ze.streams.domain.Category;
import devdojo.maratonajava.javacore.ze.streams.domain.LightNovel;
import devdojo.maratonajava.javacore.ze.streams.domain.Promotion;

import static devdojo.maratonajava.javacore.ze.streams.domain.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest {
    private static List<LightNovel> lightNovels = new ArrayList<>(
            List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
                    new LightNovel("Overlord", 10.99, Category.FANTASY),
                    new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
                    new LightNovel("No Game no life", 2.99, Category.FANTASY),
                    new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
                    new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
                    new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
                    new LightNovel("Monogatari", 4.00, Category.ROMANCE)));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println("------------------");

        System.out.println(lightNovels); // [LightNovel{title='Fullmetal Alchemist', price=5.99, category=null},
                                         // LightNovel{title='Kumo desuga', price=1.99, category=null},
                                         // LightNovel{title='Monogatari', price=4.0, category=null},
                                         // LightNovel{title='No Game no life', price=2.99, category=null},
                                         // LightNovel{title='Overlord', price=3.99, category=null},
                                         // LightNovel{title='Tensei Shittara', price=8.99, category=null},
                                         // LightNovel{title='Violet Evergarden', price=5.99, category=null}]
        System.out.println("------------------");

        System.out.println(titles); // [Kumo desuga, Monogatari, No Game no life]

        System.out.println("------------------");

        lightNovels.stream().map(LightNovel::getPrice).filter(price -> price > 3).reduce(Double::sum)
                .ifPresent(System.out::println); // 28.96

        double sum = lightNovels.stream() // Stream<Double>
                .mapToDouble(LightNovel::getPrice).filter(price -> price > 3).sum();

        System.out.println(sum); // 28.96

        System.out.println("------------------");

        System.out.println(lightNovels.stream().count()); // 7
        System.out.println(lightNovels.stream().collect(Collectors.counting())); // 7

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum()); // 33.94
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice))); // 33.94

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println); // 4.848571428571428
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice))); // 4.848571428571428
        
        String titles2 = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles2); // Fullmetal Alchemist, Kumo desuga, Monogatari, No Game no life, Overlord,
                                     // Tensei Shittara, Violet Evergarden

        System.out.println("------------------");

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(groupingBy(StreamTest::getPromotion));
        System.out.println(collect);
        /**
         {NORMAL_PRICE=[LightNovel{title='Overlord', price=10.99, category=FANTASY}, LightNovel{title='Tensei Shittara', price=8.99, category=FANTASY}], UNDER_PROMOTION=[LightNovel{title='Fullmetal Alchemist', price=5.99, category=FANTASY}, LightNovel{title='Kumo desuga', price=1.99, category=FANTASY}, LightNovel{title='Kumo desuga', price=1.99, category=FANTASY}, LightNovel{title='Monogatari', price=4.0, category=ROMANCE}, LightNovel{title='No Game no life', price=2.99, category=FANTASY}, LightNovel{title='Violet Evergarden', price=5.99, category=DRAMA}]}
        */

        System.out.println("------------------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(StreamTest::getPromotion)));
        System.out.println(collect1);
        /**
         {ROMANCE={UNDER_PROMOTION=[LightNovel{title='Monogatari', price=4.0, category=ROMANCE}]}, DRAMA={UNDER_PROMOTION=[LightNovel{title='Violet Evergarden', price=5.99, category=DRAMA}]}, FANTASY={NORMAL_PRICE=[LightNovel{title='Overlord', price=10.99, category=FANTASY}, LightNovel{title='Tensei Shittara', price=8.99, category=FANTASY}], UNDER_PROMOTION=[LightNovel{title='Fullmetal Alchemist', price=5.99, category=FANTASY}, LightNovel{title='Kumo desuga', price=1.99, category=FANTASY}, LightNovel{title='Kumo desuga', price=1.99, category=FANTASY}, LightNovel{title='No Game no life', price=2.99, category=FANTASY}]}}
        */
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
