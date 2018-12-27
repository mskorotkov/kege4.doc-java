import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task19 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1305, 7850)
                .filter(num -> (num % 4 == 0 || num % 7 == 0))
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 21 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int min = stats.getMin();
        System.out.println(count + " " + min);
    }
}