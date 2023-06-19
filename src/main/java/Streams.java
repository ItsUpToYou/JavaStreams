import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        System.out.println("gi");

        Map<String, List<String>> personMap = PersonRepository
                .getAllPersons()
                .stream()
                .filter((p) -> p.getHeight() > 160)
                .filter((p) -> p.getGender().equals("Male"))
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));
        System.out.println("Person Map: " + personMap);


        List<String> personHobbies = PersonRepository
                .getAllPersons() //List of persons
                .stream()//Stream of persons
                .map(Person::getHobbies)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .collect(Collectors.toList());//Collection to be returned

        System.out.println("Person hobbies : " +  personHobbies);
    }
}
