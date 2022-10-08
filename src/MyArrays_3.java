import java.util.Scanner;

public class MyArrays_3{
    public static void print_arr(int[] arr){
        if (arr.length == 0){
            System.out.println(-1);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] minToBegin(int[] arr){
        int min_ind = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < arr[min_ind]){
                min_ind = i;
            }
        }
        while(min_ind > 0) {
            int c = arr[min_ind - 1];
            arr[min_ind - 1] = arr[min_ind];
            arr[min_ind] = c;
            min_ind--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        print_arr(minToBegin(arr));

    }
}
