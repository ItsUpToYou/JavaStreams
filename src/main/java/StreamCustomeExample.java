import java.util.Comparator;

public class StreamCustomeExample {
    public static void main(String[] args) {
        System.out.println("Sort By Name");
        PersonRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("Reversed Sort By Name");
        PersonRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

        System.out.println("Sort By Hight");
        PersonRepository.getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getHeight))
                .forEach(System.out::println);
    }
}
