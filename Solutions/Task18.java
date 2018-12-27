import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task18 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(980, 5320)
                .filter(num -> (num % 4 == 0 || num % 5 == 0))
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 23 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int min = stats.getMin();
        System.out.println(count + " " + min);
    }
}