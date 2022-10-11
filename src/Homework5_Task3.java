import java.util.Scanner;

public class Homework5_Task3 {

    public static void print_mass(int [][] mass, int n){
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (mass[x][y] < 10) {
                    System.out.print(mass[x][y] + "\t");
                }
                else {
                    System.out.print(mass[x][y] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        int [][] mass = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++){
            mass[0][i] = num;
            num++;
        }
        for (int i = 1; i < n; i++){
            mass[i][n - 1] = num;
            num++;
        }
        for (int i = n - 2; i >= 0; i--){
            mass[n - 1][i] = num;
            num++;
        }
        for(int i = 0; i > 0; i--){
            mass[i][0] = num;
            num++;
        }
        //while (num != n * n){

        //}
        print_mass(mass, n);
    }
}
