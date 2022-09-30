import java.util.Scanner;

public class Homework1_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int p = n / 100;
        int v = n % 100 / 10;
        int t = n % 10;
        int next_ch = n + (2 - n % 2);
        System.out.println(p);
        System.out.println(v);
        System.out.println(t);
        System.out.println(next_ch);
    }
}