import java.util.Scanner;

public class Homework2_Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int prelast = 1;
        int last = 1;
        if (n == 1 || n == 2){
            System.out.println(prelast);
        }
        else{
            for(int i = 0; i < n - 2; i++){
                int c = prelast + last;
                prelast = last;
                last = c;
            }
        }
        System.out.println(last);
    }
}