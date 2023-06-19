import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = listOfIntegers.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);
        System.out.println("Result of multiplication : " + listOfIntegers.stream().reduce(1, (a, b) -> a + b));//+1
        System.out.println("Result of multiplication : " + listOfIntegers.stream().reduce(2, (a, b) -> a * b));//2*120


        String names = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .reduce("", (a, b) -> a.concat((b)));
        System.out.println("Names: " + names);

        System.out.println("Tallest Person"+geteTallestPerson().get());
    }
    static Optional<Person> geteTallestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y);
    }
}
