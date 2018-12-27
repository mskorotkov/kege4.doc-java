import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Task8 {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.rangeClosed(1107, 9504)
                .filter(num -> num % 9 == 0)
                .filter(num -> num % 7 != 0)
                .filter(num -> num % 15 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .summaryStatistics();

        long count = stats.getCount();
        int min = stats.getMin();
        System.out.println(count + " " + min);
    }
}