import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task5 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1606, 9680)
                .filter(num -> num % 11 == 0)
                .filter(num -> num % 7 != 0)
                .filter(num -> num % 13 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int max = stats.getMax();
        System.out.println(count + " " + max);
    }
}