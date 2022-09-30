import java.util.Scanner;

public class Homework1_Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        x = in.nextDouble();
        y = in.nextDouble();
        if(y <= 2 - (x * x) && y >= x || y <= 2 - (x * x) && y >= 0){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}