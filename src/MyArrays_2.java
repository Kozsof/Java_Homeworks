import java.util.Scanner;

public class MyArrays_2{
    public static double avgOf4Digit(int[] arr){
        int summ = 0;
        int kol = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0 && arr[i] >= 1000 && arr[i] <= 9999){
                summ += arr[i];
                kol++;
            }
        }
        if (kol != 0)
            return summ / kol;
        return -1.00;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(avgOf4Digit(arr));

    }
}
