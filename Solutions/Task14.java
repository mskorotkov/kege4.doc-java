import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task14 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(3542, 15876)
                .filter(num -> (num % 2 == 0 || num % 9 == 0))
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 13 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 23 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int max = stats.getMax();
        System.out.println(count + " " + max);
    }
}