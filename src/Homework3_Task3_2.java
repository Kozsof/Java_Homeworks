import java.util.Scanner;

public class Homework3_Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        int mini = 0;
        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            arr[i] = num;

            if (arr[i] < arr[mini] && arr[i] > 0){
                mini = i;
            }
        }
        System.out.println(arr[mini]);
    }
}
