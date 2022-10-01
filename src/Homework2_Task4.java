import java.util.Scanner;

public class Homework2_Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int minnum = 10;
        while(n > 0){
            int a = n % 10;
            if (a < minnum && a != 0) {
                minnum = a;
            }
            n /= 10;
        }
        System.out.println(minnum);
    }
}