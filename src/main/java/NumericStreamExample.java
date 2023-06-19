import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumericStreamExample {

    static BinaryOperator<Integer> bOperatpr = (x, y) -> x + y;
    static int calculateSum(List<Integer> ls) {
        return ls.stream().reduce(0, bOperatpr);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Total Integers is " +calculateSum(integers));

        IntStream intStream = IntStream.rangeClosed(1, 7);
        System.out.println("Total Stream Sum is " + intStream.sum());
    }


}
