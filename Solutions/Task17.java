import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task17 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1056, 7563)
                .filter(num -> (num % 3 == 0 || num % 11 == 0))
                .filter(num -> num % 13 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 23 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int min = stats.getMin();
        System.out.println(count + " " + min);
    }
}