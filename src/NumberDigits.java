import java.util.Scanner;

public class NumberDigits {

    public static int sumOfSeven(int a, int b){
        int summ = 0;
        for(int i = a; i <= b; i++){
            if (i % 7 == 0 && i >= 10 && i < 100){
                int s = i;
                while(s > 0){
                    summ += s % 10;
                    s /= 10;
                }
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(sumOfSeven(a, b));

    }
}
