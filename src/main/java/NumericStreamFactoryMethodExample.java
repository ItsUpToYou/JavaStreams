import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamFactoryMethodExample {
    public static void main(String[] args) {
        IntStream intStreamA = IntStream.rangeClosed(1, 6);
        IntStream intStreamB = IntStream.range(1, 6); //range
        intStreamA.forEach(System.out::println);
        System.out.println("-------------");
        intStreamB.forEach(System.out::println);

        LongStream.rangeClosed(1, 6).asDoubleStream().forEach(System.out::println); //
        DoubleStream ds = LongStream.rangeClosed(1, 6).asDoubleStream();
        ds.forEach(System.out::println);//
    }
}
