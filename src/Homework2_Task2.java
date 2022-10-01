import java.util.Scanner;

public class Homework2_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int rabbit = 11;
        int wolf = 2;
        int eaten = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                rabbit *= 3;
            }
            else {
                if (rabbit < 10 * wolf) {
                    wolf -= 1;
                }
                else {
                    rabbit -= 10;
                    eaten += 10 * wolf;
                }
            }
            if (eaten / 70 > 0) {
                wolf += eaten / 70;
                eaten -= 70 * (eaten / 70);
            }
            if(rabbit >= 19000000){
                rabbit = 19000000;
            }
        }
        System.out.println("Rabbits: " + rabbit);
        System.out.println("Wolves: " + wolf);
    }
}