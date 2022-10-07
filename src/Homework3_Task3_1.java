import java.util.Scanner;

public class Homework3_Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int mini = 2147483647;
        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            if (num < mini && num > 0){
                mini = num;
            }
        }
        System.out.println(mini);
    }
}
