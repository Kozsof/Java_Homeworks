import java.util.Scanner;

public class Homework1_Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if(a % 5 == 0 && b % 5 == 0){
            System.out.print("true");
        }
        else if(c % 5 == 0 && b % 5 == 0){
            System.out.print("true");
        }
        else if(a % 5 == 0 && c % 5 == 0){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}