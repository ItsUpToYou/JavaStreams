import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aaa1","Bbbbbbb2","Cc3","Ddd4","Eee5","F6","Ggfgggggggg7");

        Stream<String> allNames =names.stream();

        Stream<String> updatesList = allNames.filter(s -> s.length() > 3);

        updatesList.forEach(System.out::println);

        names.stream()
                .filter(s->s.length()>3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        PersonRepository.getAllPersons()
                .stream()
                .filter(s-> s.getHeight() > 160)
                .filter(pr -> pr.getGender().equals("Male"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
