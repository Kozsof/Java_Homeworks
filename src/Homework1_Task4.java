import java.util.Scanner;

public class Homework1_Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        n = in.nextDouble();
        if(n < -2 || (n > 3 && n < 6) || n > 9){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }


    }
}