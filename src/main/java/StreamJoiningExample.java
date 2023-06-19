import java.lang.annotation.RetentionPolicy;
import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String joiningExamole() {
        String str = PersonRepository.getAllPersons()
            .stream()
            .map(Person::getName)
            .collect(Collectors.joining(",","***","$$$"));
        return str;
    }
    public static void main(String[] args) {
        System.out.println(joiningExamole());
    }

}
