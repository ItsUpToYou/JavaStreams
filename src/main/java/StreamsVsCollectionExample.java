import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("john");
        names.add("Andy");
        names.add("Nancy");
        names.add("Thomas");

        for (String name : names) {
            System.out.println(">>>>> " + name);
        }

        Stream<String> stream = names.stream();
        stream.forEach(p-> System.out.println("<<<<< "+p));
        //stream.forEach(p-> System.out.println("<<<<< "+p)); // can do it only once with the stream.

        List<String> personNames = PersonRepository
                .getAllPersons()
                .stream()
                .peek(per -> System.out.println(per))
                .map(Person::getName)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
