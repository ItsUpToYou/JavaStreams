import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons() {
        Person p1 = new Person("John", 165, 2000, "Male", 2, Arrays.asList("Fo1", "Sll","1"));
        Person p2 = new Person("Klark", 158, 3000, "Male", 2, Arrays.asList("Go3", "Sll","2"));
        Person p3 = new Person("Nial", 140, 4000, "Male", 2, Arrays.asList("ZFG", "Sll", "3"));
        Person p4 = new Person("Ronda", 182, 5000, "Female", 2, Arrays.asList("PlD", "Sll", "4"));
        Person p5 = new Person("Ciel", 177, 6000, "Female", 2, Arrays.asList("FGD", "Sll", "5"));
        Person p6 = new Person("Smith", 115, 7000, "Male", 2, Arrays.asList("XSLD", "Sll", "6"));
        Person p7 = new Person("Smith", 182, 7000, "Male", 2, Arrays.asList("XSLD", "Sll", "6"));

        return Arrays.asList(p1, p2, p3, p4, p5, p6,p7);
    }

}
