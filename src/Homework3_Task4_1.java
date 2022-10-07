import java.util.Scanner;

public class Homework3_Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int num1 = in.nextInt();
        for (int i = 1; i < n; i++){
            int num2 = in.nextInt();
            if (num1 > num2){
                System.out.print(num1 + " ");
            }
            num1 = num2;
        }
    }
}
