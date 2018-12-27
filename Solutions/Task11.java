import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task11 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1305, 14063)
                .filter(num -> (num % 2 == 0 || num % 3 == 0))
                .filter(num -> num % 7 != 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 23 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int max = stats.getMax();
        System.out.println(count + " " + max);
    }
}