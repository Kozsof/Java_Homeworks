import java.util.Scanner;

public class Homework3_Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        int num = in.nextInt();
        arr[0] = num;
        for (int i = 1; i < n; i++){
            num = in.nextInt();
            arr[i] = num;
            if (arr[i - 1] > arr[i]){
                System.out.print(arr[i - 1] + " ");
            }
        }
    }
}
