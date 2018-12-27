import java.util.stream.IntStream;

public class Example1_2 {

    public static void main(String[] args) {
        long count = IntStream.rangeClosed(1033, 7737)
                .filter(num -> num % 5 == 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 23 != 0)
                .count();

        int max = IntStream.rangeClosed(1033, 7737)
                .filter(num -> num % 5 == 0)
                .filter(num -> num % 11 != 0)
                .filter(num -> num % 17 != 0)
                .filter(num -> num % 19 != 0)
                .filter(num -> num % 23 != 0)
                .max().orElse(0);

        System.out.println(count + " " + max);
    }
}
