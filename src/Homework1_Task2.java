import java.util.Scanner;

public class Homework1_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, k, n;
        r = in.nextInt();
        k = in.nextInt();
        n = in.nextInt();
        int rr = r * n;
        int kk = k * n;
        rr = rr + kk / 100;
        kk = kk % 100;
        System.out.println(rr);
        System.out.println(kk);
    }
}