import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task7 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(200, 9120)
                .filter(num -> num % 8 == 0)
                .filter(num -> num % 7 != 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int min = stats.getMin();
        System.out.println(count + " " + min);
    }
}