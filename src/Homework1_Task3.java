import java.util.Scanner;

public class Homework1_Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int m = n / 60;
        int ch = m / 60;
        int s = n - m * 60;
        int m2 = m - ch * 60;
        ch = ch % 24;
        System.out.print(ch + ":");
        if(m2 < 10){
            System.out.print("0" + m2 + ":");}
        else{
            System.out.print(m2 + ":");}
        if(s < 10){
            System.out.print("0" + s);}
        else{
            System.out.print(s);}
    }
}