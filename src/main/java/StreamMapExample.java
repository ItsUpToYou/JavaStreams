import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    static List<String> toUpperTransform(List<Person> listOfPErsons) {
        return listOfPErsons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    static Set<String> toUpperTransformSet(List<Person> listOfPErsons) {
        return listOfPErsons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Bannana", "Cherry");
        List<Integer> fruitsLength =
                fruits.stream()
                        .map(String::length)
                        .collect(Collectors.toList());
        System.out.println(fruitsLength);

        fruits.stream()
                .map(String::length)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("All letters uppercase: "+toUpperTransform(PersonRepository.getAllPersons()));
        System.out.println("All letters uppercase: "+toUpperTransformSet(PersonRepository.getAllPersons()));

    }
}
