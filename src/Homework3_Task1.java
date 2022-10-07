import java.util.Scanner;

public class Homework3_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, ch, new_rev_n = 0;
        n = in.nextInt();
        ch = in.nextInt();
        int poww = 1;
        while (n > 0) {
            if (n % 10 != ch) {
                new_rev_n += n % 10 * poww;
                poww *= 10;
            }
            n /= 10;
        }
        System.out.println(new_rev_n);
    }
}