import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {

    public static void main(String[] args) {
        Stream<Integer> nums = Stream.iterate(0, x -> x + 5).limit(10);
        nums.forEach(System.out::println);

        Stream<Double> rnd = Stream.generate(Math::random).limit(10);
        rnd.forEach(System.out::println);

        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        Stream<String> str = Stream.of("o1","o2","03","04","05");
        str.forEach(System.out::println);
    }
}
