package consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> {
            System.out.println(s.toUpperCase());
        };
        consumer.accept("Java");

        Consumer<String> consumer2 = (s) -> System.out.println(s.toLowerCase());
        consumer2.accept("JDK");

        consumer.andThen(consumer2).accept("Ja1Va");
    }
}
