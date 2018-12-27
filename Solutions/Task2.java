import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task2 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(3201, 12876)
                .filter(num -> num % 4 == 0)
                .filter(num -> num % 7 != 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 13 != 0)
                .filter(num -> num % 19 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int max = stats.getMax();
        System.out.println(count + " " + max);
    }
}