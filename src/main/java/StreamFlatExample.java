import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatExample {

    public static List<String> hobbies(List<Person> personList) {
        return personList.stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> oddNumbers = Arrays.asList(1, 23, 17, 15);
        List<Integer> evenNumbers = Arrays.asList(6, 2, 22,14);

        List<List<Integer>> listOfList = Arrays.asList(oddNumbers, evenNumbers);
        System.out.println("Before flatmap: "+listOfList);

        List<Integer> flattenList = listOfList
                .stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("After flatmap" + flattenList);

        System.out.println("Hobbies results" + hobbies(PersonRepository.getAllPersons()));
    }
}
