import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    static double map2Double() {
        return IntStream.rangeClosed(1,5).mapToDouble(x->x).sum();
    }

    static double map2Long() {
        return IntStream.rangeClosed(1,5) //  primitive elements
            .mapToLong(x->x)//convert elements to Long
            .sum();
    }

    static List<Integer> map2Object() {
        return IntStream.rangeClosed(1,5)
            .mapToObj(x->x)
            .collect(Collectors.toList());
    }
    public static void main(String[] args) {

    }

}
