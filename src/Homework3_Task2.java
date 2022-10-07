import java.util.Scanner;

public class Homework3_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, rev_num = 0;
        n = in.nextInt();
        boolean neg = false;
        if (n < 0){
            neg = true;
        n *= -1;
        }
        while(n > 0) {
            rev_num *= 10;
            rev_num += n % 10;
            n /= 10;
        }
        if(neg){
            rev_num *= -1;
        }
        System.out.println(rev_num);
    }
}
