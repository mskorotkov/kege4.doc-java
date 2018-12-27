public class Example1_3 {

    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        for (int num = 1033; num <= 7737; num++) {
            if (check(num)) {
                count++;
                max = num;
            }
        }
        System.out.println(count + " " + max);
    }

    private static boolean check(int num) {
        return (num % 5 == 0) && (num % 11 != 0) && (num % 17 != 0) && (num % 19 != 0) && (num % 23 != 0);
    }
}
