import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example1_1 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1033, 7737)
                .filter(num -> num % 5 == 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 23 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int max = stats.getMax();
        System.out.println(count + " " + max);
    }
}
