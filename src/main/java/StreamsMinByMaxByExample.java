import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    static Optional<Person> getTallestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
    }
    static Optional<Person> getShortestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
    }
    static List<Person>filterMultiplePerson(){
        List<Person> personList = new ArrayList<>();
        Optional < Person > maxHeight = getTallestPerson();
        Person per =maxHeight.isPresent() ? maxHeight.get() : null;
        personList = PersonRepository.getAllPersons()
                .stream()
                .filter(person -> person.getHeight() == per.getHeight())
                .collect(Collectors.toList());
        return personList;
    }
    public static void main(String[] args) {
        System.out.println(getTallestPerson().get());
        System.out.println(getShortestPerson().get());
        System.out.println(filterMultiplePerson());

    }
}
